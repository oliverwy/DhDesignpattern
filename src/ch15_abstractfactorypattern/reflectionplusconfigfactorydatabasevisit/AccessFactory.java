package ch15_abstractfactorypattern.reflectionplusconfigfactorydatabasevisit;

public class AccessFactory implements IFactory {

    @Override
    public IUser createUser() {
        // TODO Auto-generated method stub
        return new AccessUser();
    }

    @Override
    public IDepatment createDepartment() {
        // TODO Auto-generated method stub
        return new AccessDepartment();
    }

}