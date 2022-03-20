package ch15_abstractfactorypattern.factorydatabasevisit;

public class ClientUserDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        User user = new User();
        IFactory factory=new MySQLServerFactory();
//        IFactory factory = new AccessFactory();
        IUserOperate userEntity = factory.createUserEntity();
        userEntity.insert(user);
        userEntity.getUser(0);
        Department deparment=new Department();
        
        IDFactory dfactory=new MySQLServerDFactory();
        IDeparmentOperate departmentEntity=dfactory.createDepatentEntity();
        departmentEntity.insert(deparment);
        departmentEntity.getDepartment(1);
	}

}
