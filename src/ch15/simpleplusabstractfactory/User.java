package ch15.simpleplusabstractfactory;

public class User
{
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
interface IUser {
	public void insert(User user);
	public User getUse(int id);

}
class SqlserverUser implements IUser
{
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在SQLserver中添加一条User记录");
	}

	@Override
	public User getUse(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SQLserver中根据ID得到User表的一条记录");
		return null;
	}
}

class AccessUser implements IUser
{

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在Access中添加一条User记录");
	}

	@Override
	public User getUse(int id) {
		// TODO Auto-generated method stub
		System.out.println("在AAcesss中根据ID得到User表的一条记录");
		return null;
	}
	
}



