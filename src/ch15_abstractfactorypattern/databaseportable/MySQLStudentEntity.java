package ch15_abstractfactorypattern.databaseportable;

import java.sql.Connection;

public class MySQLStudentEntity implements IStudent {
	private Connection con;
	@Override
	public void insert(Student s) {
		// TODO Auto-generated method stub

	}

	public MySQLStudentEntity(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public Student getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
