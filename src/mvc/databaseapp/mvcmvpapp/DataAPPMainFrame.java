package mvc.databaseapp.mvcmvpapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class DataAPPMainFrame extends JFrame {
    private final int COLUMN = 7;
    private final List<String> TITLES = Arrays.asList("Sid", "Sname", "Ssex", "Sage", "Sclass", "Sdept", "Saddr");
    private final List<String> VTITLES = Arrays.asList(
            "学号", "姓名", "性别", "年龄", "专业", "系别", "家庭地址");

    private QueryItem addr = new QueryItem("地址：", 10);
    private QueryItem2 age = new QueryItem2("年龄自：", "到", 5);
    private QueryItem class_ = new QueryItem("班级：", 5);
    private DataModel d_model = new DataModel();

    private Vector<Vector<String>> dataModel = new Vector<Vector<String>>();

    private JButton deleteBtn = new JButton("删除");

    private QueryItem dept = new QueryItem("系别：", 5);

    private QueryItem id = new QueryItem("学号：", 10);

    private JButton insertBtn = new JButton("添加");

    private QueryItem name = new QueryItem("姓名：", 10);

    private JButton queryBtn = new JButton("查询");

    private JButton saveBtn = new JButton("修改");

    private QueryItem sex = new QueryItem("性别：", 5);

    private MyTable table;

    private JTextArea textarea = new JTextArea(5, 5);

    // 构造函数，负责创建用户界面
    public DataAPPMainFrame(String title) throws SQLException, ClassNotFoundException {
        super(title);

        Vector<String> titles = new Vector<String>(VTITLES);
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

        getContentPane().add(controlPanel, BorderLayout.NORTH);
        getContentPane().add(container, BorderLayout.CENTER);
        getContentPane().add(Box.createRigidArea(new Dimension(20, 0)), BorderLayout.WEST);
        getContentPane().add(Box.createRigidArea(new Dimension(20, 0)), BorderLayout.EAST);
        getContentPane().add(Box.createRigidArea(new Dimension(0, 20)), BorderLayout.SOUTH);
        DataAppController objButtonHandler = new DataAppController(d_model, this);

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DataAPPMainFrame frame = new DataAPPMainFrame("学生基本信息录入和查询");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(750, 500));
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public void adddeleteListener(ActionListener ma) {
        deleteBtn.addActionListener(ma);
    }

    public void addInsertListener(ActionListener ma) {
        insertBtn.addActionListener(ma);
    }

    public void addQueryListener(ActionListener ma) {
        queryBtn.addActionListener(ma);
    }

    public void addUpdateListener(ActionListener ma) {
        saveBtn.addActionListener(ma);
    }

    public void dataModelAddManyRecord(Vector<Vector<String>> ss) {
        dataModel.addAll(ss);
    }

    public void dataModelAddOneRecord(Vector<String> singleRecord) {
        dataModel.add(singleRecord);
    }

    public void dataModleClear() {
        dataModel.clear();
    }

    public boolean getAddrSelected() {
        return addr.isSelected();
    }

    public String getAddrText() {
        return addr.getText();
    }

    public String getAgeEndText() {
        return age.getText2();
    }

    public boolean getAgeSelected() {
        return age.isSelected();
    }

    public String getAgeStartText() {
        return age.getText();
    }

    public boolean getClass_Selected() {
        return class_.isSelected();
    }

    public String getClass_Text() {
        return class_.getText();
    }

    public boolean getDeptSelected() {
        return dept.isSelected();
    }

    public String getDeptText() {
        return dept.getText();
    }

    public boolean getIDSelected() {
        return id.isSelected();
    }

    public String getIDtext() {
        return id.getText();
    }

    public boolean getNameSelected() {
        return name.isSelected();
    }

    public String getNameText() {
        return name.getText();
    }

    public boolean getSexSelected() {
        return sex.isSelected();
    }

    public String getSexText() {
        return sex.getText();
    }

    public int getTableSelectedColumn() {
        return table.getSelectedColumn();
    }

    public int getTableSelectedRow() {
        return table.getSelectedRow();
    }

    public String getTableSelectedValue(int row, int col) {
        return dataModel.get(row).get(col);
    }

    public String getTableSID(int row) {
        return dataModel.get(row).get(0);
    }

    public void removeDataModelRow(int row) {
        dataModel.remove(row);
    }

    public void setTextArea(String content) {
        textarea.setText(content);
    }

    public void tableRepaint() {
        table.validate();
        table.updateUI();
    }

    // 程序启动时，需调用该方法连接到数据库
    // 之所以不放在构造函数中，是因为这些操作可能抛出异常，需要单独处理
//    public void connectToDB() throws SQLException, ClassNotFoundException {
//        Class.forName("org.mariadb.jdbc.Driver");
//        final String URL = "jdbc:mariadb://localhost:3306/mydb?characterEncoding=UTF-8";
//        conn = DriverManager.getConnection(URL, "pmauser", "yzhi0788");
//    }

}

/*
 * 表格组件 重载了 JTable 的 isCellEditable 方法 目的是防止编辑 Sid 字段，禁止修改主键
 */
class MyTable extends JTable {
    public MyTable(Vector data, Vector title) {
        super(data, title);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if (column == 0)
            return false;
        else
            return true;
    }
}

/*
 * 查询项目 将复选框、标签、文本框组合成一个组件 对外提供获取文本和选中状态的两个方法
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

    public String getText() {
        return textfield.getText();
    }

    public boolean isSelected() {
        return checkbox.isSelected();
    }
}

/*
 * 同样是查询项目 这是用于查询年龄范围的组件，包含了两个文本框 因此特殊处理，并增加了获取第二个文本框内容的方法
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