package ch15.reflectionplusconfigfactorydatabasevisit;

import org.dom4j.DocumentException;

public class Client {

	public static void main(String[] args) throws DocumentException {
		// TODO Auto-generated method stub
		User user=new User();
		Department dept=new Department();
		IFactory databasefactory=null;
		DataAccessfactory dd=new DataAccessfactory();
		dd.getDatabaseConfig();
		databasefactory=dd.createDatabase();
		IUser iu=databasefactory.createUser();
		iu.insert(user);
		iu.getUse(0);
		IDepatment id=databasefactory.createDepartment();
		id.insert(dept);
		id.getDepartment(0);
	}

}
