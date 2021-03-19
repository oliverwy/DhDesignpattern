package ch15_abstractfactorypattern.factorydatabasevisit;

import java.sql.Connection;

public interface IUser {
    public void insert(User user);

    public User getUse(int id);

}

interface IFactory {
    public IUser createUser();
}

class SqlserverUser implements IUser {
    @Override
    public void insert(User user) {
        // TODO Auto-generated method stub
        System.out.println("在SQLserver中添加一条记录");
    }

    @Override
    public User getUse(int id) {
        // TODO Auto-generated method stub
        System.out.println("在SQLserver中根据ID得到User表的一条记录");
        return null;
    }
}

class AccessUser implements IUser {

	private Connection con;
	private void connectToDB()
	{
		
	}
	public AccessUser() {
		super();
		connectToDB();
		// TODO Auto-generated constructor stub
	}
	@Override
    public void insert(User user) {
        // TODO Auto-generated method stub
        System.out.println("在Access中添加一条记录");
    }

    @Override
    public User getUse(int id) {
        // TODO Auto-generated method stub
        System.out.println("在AAcesss中根据ID得到User表的一条记录");
        return null;
    }

}

class SqlserverFactory implements IFactory {

    @Override
    public IUser createUser() {
        // TODO Auto-generated method stub
        return new SqlserverUser();
    }

}

class AccessFactory implements IFactory {

    @Override
    public IUser createUser() {
        // TODO Auto-generated method stub
        return new AccessUser();
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