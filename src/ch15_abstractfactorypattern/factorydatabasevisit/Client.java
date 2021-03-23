package ch15_abstractfactorypattern.factorydatabasevisit;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        User user = new User();
//        IFactory factory=new SqlserverFactory();
        IFactory factory = new AccessFactory();
        IUserOperate userEntity = factory.createUserEntity();
        userEntity.insert(user);
        userEntity.getUser(0);
    }

}
