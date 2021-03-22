package ch15_abstractfactorypattern.abstractfactorydatabasevisit;

import java.sql.Connection;

public interface IFactory {
	public void connectToDb();
	public IUserOperate createUserEntity();
	public IDepatmentOperate createDepatentEntity();
}

class SqlserverFactory implements IFactory {

	private Connection con;
	public SqlserverFactory() {
		super();
		connectToDb();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void connectToDb() {
		// TODO Auto-generated method stub
		System.out.println("连接到SQLserver数据库");
	}

	@Override
	public IUserOperate createUserEntity() {
		// TODO Auto-generated method stub
		return new SqlserverUserEntity();
	}

	@Override
	public IDepatmentOperate createDepatentEntity() {
		// TODO Auto-generated method stub
		return new SqlserverDepartmentEntity();
	}


}

class AccessFactory implements IFactory {

	private Connection con;

	public AccessFactory() {
		super();
		connectToDb();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void connectToDb() {
		// TODO Auto-generated method stub
		System.out.println("连接到Access数据库");
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