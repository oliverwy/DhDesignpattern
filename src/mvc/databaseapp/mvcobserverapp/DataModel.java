package mvc.databaseapp.mvcobserverapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;


public class DataModel implements Observable {
    private final int COLUMN = 7;
    private final List<String> TITLES = Arrays.asList("Sid", "Sname", "Ssex", "Sage", "Sclass", "Sdept", "Saddr");
    private Vector<Observer> observersList;
    private boolean isQueryBtuClicked = false;
    private boolean isInsertBtnClicked = false;
    private boolean isDeleteBtnClicked = false;
    private boolean isUpdateBtnClicked = false;
    private Connection conn;
    private Vector<Vector<String>> re = new Vector<Vector<String>>();

    public DataModel() throws SQLException, ClassNotFoundException {
        super();
        this.connectToDB();
        observersList = new Vector<Observer>();
    }

    public boolean isQueryBtuClicked() {
        return isQueryBtuClicked;
    }

    public void setQueryBtuClicked(boolean isQueryBtuClicked) {
        this.isQueryBtuClicked = isQueryBtuClicked;
    }

    public boolean isInsertBtnClicked() {
        return isInsertBtnClicked;
    }

    public void setInsertBtnClicked(boolean isInsertBtnClicked) {
        this.isInsertBtnClicked = isInsertBtnClicked;
    }

    public boolean isDeleteBtnClicked() {
        return isDeleteBtnClicked;
    }

    public void setDeleteBtnClicked(boolean isDeleteBtnClicked) {
        this.isDeleteBtnClicked = isDeleteBtnClicked;
    }

    public boolean isUpdateBtnClicked() {
        return isUpdateBtnClicked;
    }

    public void setUpdateBtnClicked(boolean isUpdateBtnClicked) {
        this.isUpdateBtnClicked = isUpdateBtnClicked;
    }

    public void connectToDB() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        final String URL = "jdbc:mariadb://localhost:3306/mydb?characterEncoding=UTF-8";
        conn = DriverManager.getConnection(URL, "pmauser", "yzhi0788");
    } // 连接数据库

    public String buildSQLQuery(ArrayList<String> conditions)
    /**
     * 根据界面选择的查询选项构造查询的ＳＱＬ语句，返回给ＵＩ显示
     */
    {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from student");
        int length = conditions.size();
        if (length != 0)
            sb.append(" where ");
        for (int i = 0; i < length; i++) {
            sb.append(conditions.get(i));
            if (i != length - 1)
                sb.append(" AND ");
        }
        sb.append(";");
        String queryString = sb.toString();
        return queryString;
    }

    public Vector<Vector<String>> getQueryResult(String qs) {
        re.clear();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qs);
            Vector<String> record;
            while (rs.next()) {
                record = new Vector<String>();
                for (int i = 0; i < COLUMN; i++) {
                    record.add(rs.getString(i + 1));
                }
                re.add(record);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return re;
    }

    public String buildSQLInsertStatement(String sid, String sname, String ssex, String sage, String sclass,
                                          String sdept, String saddr) {

        String cmd = "insert into student values ('" + sid + "', '" + sname + "', '" + ssex + "', " + sage + ", '"
                + sclass + "', '" + sdept + "', '" + saddr + "');";
        return cmd;
    }

    public String buildSQLUpdateStatement(int col, String val, String sid) {

        // 在文本框显示 SQL 命令
        String cmd = "update student set " + TITLES.get(col) + " = ";
        cmd += (TITLES.get(col) == "Sage") ? val : "'" + val + "'";
        cmd += " where Sid = '" + sid + "';";
        return cmd;
    }

    public String buildSQLDeleteStatement(String sid) {
        String sql = "delete from student where Sid = '" + sid + "';";
        return sql;

    }

    public int exeSQLStatement(String sql) {
        int rs = 0;
        Statement stmt;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeUpdate(sql);
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return rs;
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        for (int i = 0; i < observersList.size(); i++) {
            Observer observer = (Observer) observersList.get(i);
            observer.update(this);
        }

    }

    @Override
    public void register(Observer obs) {
        // TODO Auto-generated method stub
        observersList.addElement(obs);

    }

}
