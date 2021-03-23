package ch15_abstractfactorypattern.abstractfactorydatabasevisit;

public class Client {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();
//        IFactory factory=new SqlserverFactory();
        IFactory factory = new AccessFactory();
        IUserOperate UserEntity = factory.createUserEntity();
        UserEntity.insert(user);
        UserEntity.getUser(0);

        IDepatmentOperate DepatmentEntity = factory.createDepatentEntity();
        DepatmentEntity.insert(department);
        DepatmentEntity.getDepartment(0);
    }

}
