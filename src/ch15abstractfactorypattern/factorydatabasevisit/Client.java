package ch15abstractfactorypattern.factorydatabasevisit;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		//IFactory factory=new SqlserverFactory();
		IFactory factory=new AccessFactory();
		IUser iu=factory.createUser();
		iu.insert(user);
		iu.getUse(0);
	}

}
