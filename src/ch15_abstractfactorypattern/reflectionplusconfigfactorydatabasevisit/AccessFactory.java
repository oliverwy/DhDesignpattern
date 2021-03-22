package ch15_abstractfactorypattern.reflectionplusconfigfactorydatabasevisit;

import java.sql.Connection;

public class AccessFactory implements IFactory {

	public AccessFactory() {
		super();
		connectToDb();
		// TODO Auto-generated constructor stub
	}

	private Connection conn;
	@Override
	public void connectToDb() {
		// TODO Auto-generated method stub
		System.out.println("连接到Access");
	}


	@Override
	public IUserOperate createUserEntity() {
		// TODO Auto-generated method stub
		return new AccessUserEntity();
	}

	@Override
	public IDepatmentOperate createDepatentEntity() {
		// TODO Auto-generated method stub
		return new AccessDepartmentEntity();
	}

}