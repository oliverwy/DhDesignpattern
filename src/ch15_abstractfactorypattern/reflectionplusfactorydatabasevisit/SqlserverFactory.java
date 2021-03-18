package ch15_abstractfactorypattern.reflectionplusfactorydatabasevisit;

public class SqlserverFactory implements IFactory {

    @Override
    public IUser createUser() {
        // TODO Auto-generated method stub
        return new SqlserverUser();
    }

    @Override
    public IDepatment createDepartment() {
        // TODO Auto-generated method stub
        return new SqlserverDepartment();
    }

}

