package ch15.factorydatabasevisit;

public interface IUser {
	public void insert(User user);
	public User getUse(int id);

}
class SqlserverUser implements IUser
{
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

class AccessUser implements IUser
{

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

interface IFactory
{
	public IUser createUser(); 
}

class SqlserverFactory implements IFactory
{

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new SqlserverUser();
	}
	
}

class AccessFactory implements IFactory
{

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new AccessUser();
	}
	
}

class User
{
	private int ID;
	private int _id;
	private String _name;
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
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}

}