package mvc.databaseapp.mvcmvpapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class DataModel {
	public DataModel() throws SQLException, ClassNotFoundException {
		super();
		this.connectToDB();
	}

	private final int COLUMN = 7;
	private Connection conn;
	private Vector<Vector<String>> re = new Vector<Vector<String>>();
	private final List<String> TITLES = Arrays.asList("Sid", "Sname", "Ssex", "Sage", "Sclass", "Sdept", "Saddr");

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

}
