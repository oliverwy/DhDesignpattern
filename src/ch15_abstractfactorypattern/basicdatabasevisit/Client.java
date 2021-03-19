package ch15_abstractfactorypattern.basicdatabasevisit;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        SqlserverUser sUser = new SqlserverUser();
        user.setID(3);
        user.setName("ceshi");
        sUser.insert(user);
        User s=  sUser.getUser(1);
        System.out.println("s.getID():"+s.getID()+"  s.getName"+s.getName());
    }
}
