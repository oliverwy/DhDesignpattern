package ch15_abstractfactorypattern.databaseportable;

import java.sql.Connection;

public class PostgreSQlCourseEntity implements ICourse {
	private Connection con;
	@Override
	
	public void insert(Course c) {
		// TODO Auto-generated method stub
		//对象转SQL
	}

	public PostgreSQlCourseEntity(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public Course getById(String ID) {
		// TODO Auto-generated method stub
//		查询结果转对象
		return null;
	}

}
