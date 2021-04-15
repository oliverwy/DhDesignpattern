package ch15_abstractfactorypattern.databaseportable;

import java.sql.Connection;

public class MySQLCourseEntity implements ICourse {
	private Connection con;

	@Override
	public void insert(Course c) {
		// TODO Auto-generated method stub

	}

	@Override
	public Course getById(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	public MySQLCourseEntity(Connection con) {
		super();
		this.con = con;
	}

}
