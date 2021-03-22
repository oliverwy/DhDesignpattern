package ch15_abstractfactorypattern.basicdatabasevisit;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        Sqlserver sSQL = new Sqlserver();
        user.setID(3);
        user.setName("ceshi");
        sSQL.insert(user);
        User s=  sSQL.getUser(1);
        System.out.println("s.getID():"+s.getID()+"  s.getName"+s.getName());
    }
}
