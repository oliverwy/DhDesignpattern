package ch15abstractfactorypattern.reflectionplusconfigfactorydatabasevisit;

import java.io.IOException;

import org.ini4j.InvalidFileFormatException;

public class Client {

	public static void main(String[] args) throws InvalidFileFormatException, IOException {
		// TODO Auto-generated method stub
		User user=new User();
		Department dept=new Department();
		IFactory databasefactory=null;
		DataAccessfactory dd=new DataAccessfactory();
		databasefactory=dd.createDatabase();
		IUser iu=databasefactory.createUser();
		iu.insert(user);
		iu.getUse(0);
		IDepatment id=databasefactory.createDepartment();
		id.insert(dept);
		id.getDepartment(0);
	}

}
