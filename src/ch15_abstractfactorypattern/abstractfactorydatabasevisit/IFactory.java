package ch15_abstractfactorypattern.abstractfactorydatabasevisit;


public interface IFactory {
    public IUser createUser();

    public IDepatment createDepatent();
}

class SqlserverFactory implements IFactory {

    @Override
    public IUser createUser() {
        // TODO Auto-generated method stub
        return new SqlserverUser();
    }

    @Override
    public IDepatment createDepatent() {
        // TODO Auto-generated method stub
        return new SqlserverDepartment();
    }

}

class AccessFactory implements IFactory {

    @Override
    public IUser createUser() {
        // TODO Auto-generated method stub
        return new AccessUser();
    }

    @Override
    public IDepatment createDepatent() {
        // TODO Auto-generated method stub
        return new AccessDepartment();
    }

}