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
	}
	@Override
	public void connectToDb() {
		System.out.println("连接到SQLserver数据库");
	}
	@Override
	public IUserOperate createUserEntity() {
		return new SqlserverUserEntity();
	}
	@Override
	public IDepatmentOperate createDepatentEntity() {
		return new SqlserverDepartmentEntity();
	}
}

class AccessFactory implements IFactory {
	private Connection con;
	public AccessFactory() {
		super();
		connectToDb();
	}
	@Override
	public void connectToDb() {
		System.out.println("连接到Access数据库");
	}

	@Override
	public IUserOperate createUserEntity() {
		return new AccessUserEntity();
	}

	@Override
	public IDepatmentOperate createDepatentEntity() {
		return new AccessDepartmentEntity();
	}
}