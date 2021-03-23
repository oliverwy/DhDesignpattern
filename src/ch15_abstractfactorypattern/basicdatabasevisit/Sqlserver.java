package ch15_abstractfactorypattern.basicdatabasevisit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqlserver {
	private Connection conn;
	public Sqlserver() {
		connectToDB();
	}
	public void connectToDB() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			final String URL = "jdbc:mariadb://localhost:3306/mydb?characterEncoding=UTF-8";
			try {
				conn = DriverManager.getConnection(URL, "root", "yzhi0788");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void insert(User user) {
		String sql = "insert into user values (?,?);";
		PreparedStatement ps;
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1,user.getID());
			ps.setString(2,user.getName());
			ps.executeUpdate();
			System.out.println("将对象User中的信息转换成SQL");
			System.out.println("Insert into user values()");
			System.out.println("使用connect的PrepareStatement执行SQL向SQLserver中添加一条记录");
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	public User getUser(int id) {
		System.out.println("将条件的信息转换成 where SQL");
		System.out.println("select * from user");
		System.out.println("使用connect的Statement执行SQL向SQLserver中查询一条记录");
		System.out.println("将返回的数据集，填充的User对象中");
		String sql="select * from user where id = "+id+" ;";
		User u = new User();
		Statement stmt ;
		try {
			stmt = conn.createStatement();
			System.out.println(sql);
			ResultSet rs=stmt.executeQuery(sql);
			rs.next();
			u.setID(rs.getInt(1));
			u.setName(rs.getString(2));
		}
		catch (SQLException e) {
		}
		return u; // 返回的是User对象
	}
}
class User {
	private int ID;
	private String Name;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}