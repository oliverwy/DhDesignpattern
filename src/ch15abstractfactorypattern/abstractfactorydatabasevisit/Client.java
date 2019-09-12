package ch15abstractfactorypattern.abstractfactorydatabasevisit;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        User user = new User();
        Department department = new Department();
        //IFactory factory=new SqlserverFactory();
        IFactory factory = new AccessFactory();
        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUse(0);

        IDepatment iDepatment = factory.createDepatent();
        iDepatment.insert(department);
        iDepatment.getDepartment(0);
    }

}
