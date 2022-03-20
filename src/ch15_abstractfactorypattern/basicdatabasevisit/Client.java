package ch15_abstractfactorypattern.basicdatabasevisit;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        MySQLServer sSQL = new MySQLServer();
        user.setID(8);
        user.setName("其他姓名8");
        sSQL.insert(user);
        User s=  sSQL.getUser(8);
        System.out.println("s.getID():"+s.getID()+"  s.getName"+s.getName());
    }
}
