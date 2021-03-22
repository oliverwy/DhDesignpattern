package ch15_abstractfactorypattern.reflectionplusconfigfactorydatabasevisit;

import org.ini4j.InvalidFileFormatException;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws InvalidFileFormatException, IOException {
        // TODO Auto-generated method stub
        User user = new User();
        Department dept = new Department();
        IFactory databasefactory = null;
        DataAccessfactory dd = new DataAccessfactory();
        databasefactory = dd.createDatabase();
        IUserOperate iu = databasefactory.createUserEntity();
        iu.insert(user);
        iu.getUser(0);
        IDepatmentOperate id = databasefactory.createDepatentEntity();
        id.insert(dept);
        id.getDepartment(0);
    }

}
