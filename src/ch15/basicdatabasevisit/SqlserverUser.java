package ch15.basicdatabasevisit;

import javax.jws.soap.SOAPBinding.Use;

public class SqlserverUser {
	public void insert(User user) {
		System.out.println("在SQLserver中添加一条记录");
	}
	public User getUser(int id) {
		System.out.println("在SQLserver中根据ID得到User表的一条记录");
		return null;
	}
}

class User
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