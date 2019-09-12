package ch15abstractfactorypattern.reflectionplusfactorydatabasevisit;


public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        User user = new User();
        Department dept = new Department();
        IFactory databasefactory = null;
        DataAccessfactory dd = new DataAccessfactory("SqlserverFactory");
        databasefactory = dd.createobj();
        IUser iu = databasefactory.createUser();
        iu.insert(user);
        iu.getUse(0);
        IDepatment id = databasefactory.createDepartment();
        id.insert(dept);
        id.getDepartment(0);
    }

}
