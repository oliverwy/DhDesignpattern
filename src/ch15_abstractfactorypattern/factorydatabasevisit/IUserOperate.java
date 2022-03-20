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

class MySQLSqlserverUserEntity implements IUserOperate {
    @Override
    public void insert(User user) {
        System.out.println("在MySQL中添加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在MySQL中根据ID得到User表的一条记录");
        return null;
    }
}

class PostgreSQLServerUserEntity implements IUserOperate {

	@Override
    public void insert(User user) {
        System.out.println("在PostgreSQL中添加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在PostgreSQL中根据ID得到User表的一条记录");
        return null;
    }
}

class MySQLServerFactory implements IFactory {
	public MySQLServerFactory() {
		super();
		connectToDb();
	}
	private Connection conn;
	public void connectToDb() {
//		配置链接数据库的信息
		 System.out.println("连接到MySQL数据库");
		
	}
 	@Override
	public IUserOperate createUserEntity() {
		return new MySQLSqlserverUserEntity();
	}

}

class PostgreSQLServerFactory implements IFactory {
	private Connection conn;
	@Override
	public void connectToDb() {
		 System.out.println("连接到PostgreSQL数据库");
	}

	public PostgreSQLServerFactory() {
		super();
		connectToDb();
	}

	@Override
	public IUserOperate createUserEntity() {
		return new PostgreSQLServerUserEntity();
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