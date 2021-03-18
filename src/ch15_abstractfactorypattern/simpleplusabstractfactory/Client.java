package ch15_abstractfactorypattern.simpleplusabstractfactory;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        User user = new User();
        Department dept = new Department();
        IUser iu = DataAccess.createUser();
        iu.insert(user);
        iu.getUse(0);

        IDepatment id = DataAccess.createDepartment();
        id.insert(dept);
        id.getDepartment(0);
    }

}
