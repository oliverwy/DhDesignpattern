package mvc.databaseapp.protypeapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;


public class DataAPPMainFrame extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final int COLUMN = 7;
    private final List<String> TITLES = Arrays.asList(
            "Sid", "Sname", "Ssex", "Sage", "Sclass", "Sdept", "Saddr");
    private Vector<Vector<String>> dataModel = new Vector<Vector<String>>();
    private QueryItem id = new QueryItem("学号：", 10);
    private QueryItem name = new QueryItem("姓名：", 10);
    private QueryItem sex = new QueryItem("性别：", 5);
    private QueryItem2 age = new QueryItem2("年龄自：", "到", 5);
    private QueryItem class_ = new QueryItem("班级：", 5);
    private QueryItem dept = new QueryItem("系别：", 5);
    private QueryItem addr = new QueryItem("地址：", 10);
    private JButton queryBtn = new JButton("查询");
    private JButton saveBtn = new JButton("修改");
    private JButton insertBtn = new JButton("添加");
    private JButton deleteBtn = new JButton("删除");
    private JTextArea textarea = new JTextArea(5, 5);
    private MyTable table;
    private Connection conn;

    //构造函数，负责创建用户界面
    public DataAPPMainFrame(String title) {
        super(title);

        Vector<String> titles = new Vector<String>(TITLES);
        table = new MyTable(dataModel, titles);
        table.getColumnModel().getColumn(2).setPreferredWidth(30);
        table.getColumnModel().getColumn(3).setPreferredWidth(30);
        table.getColumnModel().getColumn(5).setPreferredWidth(30);
        table.getColumnModel().getColumn(6).setPreferredWidth(150);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(id);
        controlPanel.add(name);
        controlPanel.add(sex);
        controlPanel.add(age);
        controlPanel.add(class_);
        controlPanel.add(dept);
        controlPanel.add(addr);
        controlPanel.add(queryBtn);
        controlPanel.add(saveBtn);
        controlPanel.add(insertBtn);
        controlPanel.add(deleteBtn);
        controlPanel.setPreferredSize(new Dimension(0, 130));

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new BoxLayout(tablePanel, BoxLayout.Y_AXIS));
        tablePanel.add(Box.createRigidArea(new Dimension(0, 20)));
        tablePanel.add(table.getTableHeader());
        tablePanel.add(new JScrollPane(table));

        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());
        container.add(textarea, BorderLayout.NORTH);
        container.add(tablePanel, BorderLayout.CENTER);

        this.add(controlPanel, BorderLayout.NORTH);
        this.add(container, BorderLayout.CENTER);
        this.add(Box.createRigidArea(new Dimension(20, 0)), BorderLayout.WEST);
        this.add(Box.createRigidArea(new Dimension(20, 0)), BorderLayout.EAST);
        this.add(Box.createRigidArea(new Dimension(0, 20)), BorderLayout.SOUTH);

        setActionListener();
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DataAPPMainFrame frame = new DataAPPMainFrame("数据库应用演示");
        frame.connectToDB();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(750, 500));
        frame.setVisible(true);
        frame.setResizable(false);
    }

    //程序启动时，需调用该方法连接到数据库
    //之所以不放在构造函数中，是因为这些操作可能抛出异常，需要单独处理
    public void connectToDB() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        final String URL = "jdbc:mariadb://localhost:3306/mydb?characterEncoding=UTF-8";
        conn = DriverManager.getConnection(URL, "pmauser", "yzhi0788");
    }

    private void setActionListener() {
        //根据指定条件，列出数据库中满足条件的记录
        queryBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> conditions = new ArrayList<String>();
                if (id.isSelected()) conditions.add("(Sid = '" + id.getText() + "')");
                if (name.isSelected()) conditions.add("(Sname like '" + name.getText() + "')");
                if (sex.isSelected()) conditions.add("(Ssex = '" + sex.getText() + "')");
                if (age.isSelected())
                    conditions.add("(Sage >= " + age.getText() + " AND " + "Sage <= " + age.getText2() + ")");
                if (class_.isSelected()) conditions.add("(Sclass = '" + class_.getText() + "')");
                if (dept.isSelected()) conditions.add("(Sdept = '" + dept.getText() + "')");
                if (addr.isSelected()) conditions.add("(Saddr like '" + addr.getText() + "')");

                StringBuilder sb = new StringBuilder();
                sb.append("select * from student");
                int length = conditions.size();
                if (length != 0) sb.append(" where ");
                for (int i = 0; i < length; i++) {
                    sb.append(conditions.get(i));
                    if (i != length - 1) sb.append(" AND ");
                }
                sb.append(";");
                String queryString = sb.toString();
                textarea.setText(queryString);

                dataModel.clear();
                Statement stmt;
                try {
                    stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(queryString);
                    Vector<String> record;
                    while (rs.next()) {
                        record = new Vector<String>();
                        for (int i = 0; i < COLUMN; i++) {
                            record.add(rs.getString(i + 1));
                        }
                        dataModel.add(record);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

                //更新表格
                table.validate();
                table.updateUI();
            }

        });

        //根据用户当前选中的单元格，修改数据库中对应记录的对应字段
        saveBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table.getSelectedRow();
                int column = table.getSelectedColumn();
                if (row == -1 || column == 0) return;

                String val = dataModel.get(row).get(column);
                String sid = dataModel.get(row).get(0);
                String sql = "update student set " + TITLES.get(column) + " = ? where Sid = ?;";

                //在文本框显示 SQL 命令
                String cmd = "update student set " + TITLES.get(column) + " = ";
                cmd += (TITLES.get(column) == "Sage") ? val : "'" + val + "'";
                cmd += " where Sid = '" + sid + "';";
                textarea.setText(cmd);

                PreparedStatement ps;
                try {
                    ps = conn.prepareStatement(sql);
                    if (TITLES.get(column) == "Sage") ps.setInt(1, Integer.valueOf(val));
                    else ps.setString(1, val);
                    ps.setString(2, sid);
                    ps.executeUpdate();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });

        //往数据库中插入一条新的记录
        insertBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "insert into student values (?,?,?,?,?,?,?);";
                String sid = id.getText();
                String sname = name.getText();
                String ssex = sex.getText();
                String sage = age.getText();
                String sclass = class_.getText();
                String sdept = dept.getText();
                String saddr = addr.getText();

                //在文本框显示 SQL 命令
                String cmd = "insert into student values ('" + sid + "', '" + sname + "', '" +
                        ssex + "', " + sage + ", '" + sclass + "', '" + sdept + "', '" + saddr + "');";
                textarea.setText(cmd);

                PreparedStatement ps;
                try {
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, sid);
                    ps.setString(2, sname);
                    ps.setString(3, ssex);
                    ps.setInt(4, Integer.valueOf(sage));
                    ps.setString(5, sclass);
                    ps.setString(6, sdept);
                    ps.setString(7, saddr);
                    ps.executeUpdate();
                    dataModel.add(new Vector<String>(Arrays.asList(
                            sid, sname, ssex, sage, sclass, sdept, saddr)));

                    //更新表格
                    table.validate();
                    table.updateUI();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }

        });

        //将用户当前选中的记录从数据库中删除
        deleteBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table.getSelectedRow();
                String sid = dataModel.get(row).get(0);
                String sql = "delete from student where Sid = '" + sid + "';";

                //在文本框显示 SQL 命令
                textarea.setText(sql);

                Statement stmt;
                try {
                    stmt = conn.createStatement();
                    if (stmt.executeUpdate(sql) == 0) return;
                    dataModel.remove(row);

                    //更新表格
                    table.validate();
                    table.updateUI();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }

        });
    }

}

/* 查询项目
 * 将复选框、标签、文本框组合成一个组件
 * 对外提供获取文本和选中状态的两个方法
 */
class QueryItem extends JPanel {
    private JCheckBox checkbox;
    private JLabel label;
    private JTextField textfield;

    public QueryItem(String labelText, int textWidth) {
        checkbox = new JCheckBox();
        label = new JLabel(labelText);
        textfield = new JTextField(textWidth);
        this.add(checkbox);
        this.add(label);
        this.add(textfield);
    }

    public boolean isSelected() {
        return checkbox.isSelected();
    }

    public String getText() {
        return textfield.getText();
    }
}

/* 同样是查询项目
 * 这是用于查询年龄范围的组件，包含了两个文本框
 * 因此特殊处理，并增加了获取第二个文本框内容的方法
 */
class QueryItem2 extends QueryItem {
    private JLabel label2;
    private JTextField textfield2;

    public QueryItem2(String labelText, String labelText2, int textWidth) {
        super(labelText, textWidth);
        label2 = new JLabel(labelText2);
        textfield2 = new JTextField(textWidth);
        this.add(label2);
        this.add(textfield2);
    }

    public String getText2() {
        return textfield2.getText();
    }
}

/* 表格组件
 * 重载了 JTable 的 isCellEditable 方法
 * 目的是防止编辑 Sid 字段，禁止修改主键
 */
class MyTable extends JTable {
    public MyTable(Vector data, Vector title) {
        super(data, title);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if (column == 0) return false;
        else return true;
    }
}