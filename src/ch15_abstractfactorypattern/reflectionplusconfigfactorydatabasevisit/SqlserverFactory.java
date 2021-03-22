package ch15_abstractfactorypattern.reflectionplusconfigfactorydatabasevisit;

import java.sql.Connection;

public class SqlserverFactory implements IFactory {
	private Connection conn;
	@Override
	public void connectToDb() {
		// TODO Auto-generated method stub
		System.out.println("连接到SQLserver");
	}

    public SqlserverFactory() {
		super();
		connectToDb();
		// TODO Auto-generated constructor stub
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

