package ch15_abstractfactorypattern.abstractfactorydatabasevisit;

interface IUserOperate {
    public void insert(User user);
    public User getUser(int id);
}

public class User {
    private int ID;
    private String Name;

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}

class SqlserverUserEntity implements IUserOperate {
    @Override
    public void insert(User user) {
        // TODO Auto-generated method stub
        System.out.println("在SQLserver中添加一条User记录");
    }

    @Override
    public User getUser(int id) {
        // TODO Auto-generated method stub
        System.out.println("在SQLserver中根据ID得到User表的一条记录");
        return null;
    }
}

class AccessUserEntity implements IUserOperate {

    @Override
    public void insert(User user) {
        // TODO Auto-generated method stub
        System.out.println("在Access中添加一条User记录");
    }

    @Override
    public User getUser(int id) {
        // TODO Auto-generated method stub
        System.out.println("在AAcesss中根据ID得到User表的一条记录");
        return null;
    }

}



