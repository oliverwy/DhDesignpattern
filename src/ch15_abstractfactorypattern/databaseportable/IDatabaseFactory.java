package ch15_abstractfactorypattern.databaseportable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface IDatabaseFactory {
	public IStudent createStudentEntity();
	public ICourse createCourseEntity();
	public Connection getConnection();
}

class MysqlFactory implements IDatabaseFactory{
	private static Connection connection;
	private String url;
	private String driver;
	private String username;
	private String passwd;
	
	@Override
	public Connection getConnection() {
		if (connection==null)
			try {
				Class.forName(driver);
				try {
					connection = DriverManager.getConnection(url, username, passwd);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		return connection;
	}

	@Override
	public IStudent createStudentEntity() {
		// TODO Auto-generated method stub
		return new MySQLStudentEntity(connection);
	}

	@Override
	public ICourse createCourseEntity() {
		// TODO Auto-generated method stub
		return new MySQLCourseEntity(connection);
	}
	
}

class PostgreSQlFactory implements IDatabaseFactory{

	private static Connection connection;
	private String url;
	private String driver;
	private String username;
	private String passwd;

	@Override
	public Connection getConnection() {
		if (connection==null)
			try {
				Class.forName(driver);
				try {
					connection = DriverManager.getConnection(url, username, passwd);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		return connection;
	}

	@Override
	public IStudent createStudentEntity() {
		// TODO Auto-generated method stub
		return new PostgreSQlStudentEntity(connection);
	}

	@Override
	public ICourse createCourseEntity() {
		// TODO Auto-generated method stub
		return new PostgreSQlCourseEntity(connection);
	}
	
}