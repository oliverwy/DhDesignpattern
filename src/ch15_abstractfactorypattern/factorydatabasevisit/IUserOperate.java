package ch15_abstractfactorypattern.factorydatabasevisit;

import java.sql.Connection;

public interface IUserOperate {
    public void insert(User user);
    public User getUser(int id);
}

interface IFactory {
	public void connectToDb();
    public IUserOperate createUserEntity();
}

class SqlserverUserEntity implements IUserOperate {
    @Override
    public void insert(User user) {
        System.out.println("在SQLserver中添加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SQLserver中根据ID得到User表的一条记录");
        return null;
    }
}

class AccessUserEntity implements IUserOperate {

	@Override
    public void insert(User user) {
        System.out.println("在Access中添加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在AAcesss中根据ID得到User表的一条记录");
        return null;
    }
}

class SqlserverFactory implements IFactory {
	public SqlserverFactory() {
		super();
		connectToDb();
	}
	private Connection conn;
	public void connectToDb() {
//		配置链接数据库的信息
		 System.out.println("连接到SQLServer数据库");
		
	}
 	@Override
	public IUserOperate createUserEntity() {
		return new SqlserverUserEntity();
	}

}

class AccessFactory implements IFactory {
	private Connection conn;
	@Override
	public void connectToDb() {
		 System.out.println("连接到ACCESS数据库");
	}

	public AccessFactory() {
		super();
		connectToDb();
	}

	@Override
	public IUserOperate createUserEntity() {
		return new AccessUserEntity();
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