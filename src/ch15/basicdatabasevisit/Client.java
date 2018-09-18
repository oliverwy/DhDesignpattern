package ch15.basicdatabasevisit;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		SqlserverUser sUser=new SqlserverUser();
		sUser.insert(user);
		sUser.getUser(1);
	}

}
