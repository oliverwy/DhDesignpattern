package ch15_abstractfactorypattern.databaseportable;

import java.sql.Connection;

public class PostgreSQlStudentEntity implements IStudent {
	private Connection con;
	@Override
	public void insert(Student s) {
		// TODO Auto-generated method stub

	}

	@Override
	public Student getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public PostgreSQlStudentEntity(Connection con) {
		super();
		this.con = con;
	}
	

}
