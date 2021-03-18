package ch25_mediatorpattern.qqexchange;

public class Client {
    public static void main(String[] args) {
        QQUser q1 = new QQUser();
        QQUser q2 = new QQUser();
        QQUser q3 = new QQUser();
        q1.setName("张三");
        q2.setName("李四");
        q3.setName("王五");
        q1.setFri(q2); //张三和李四通信
        q2.setFri(q1);
        q1.sendMessage("你好我是张三");
        q2.displayInfo();
        q2.sendMessage("你好我是李四");
        q1.displayInfo();
        q1.setFri(q3);//张三和王五通信
        q3.setFri(q1);
        q1.sendMessage("你好我是张三");
        q3.sendMessage("你好我是王五");
        q1.displayInfo();
        q3.displayInfo();
        q2.setFri(q3);//李四和王五通信
        q3.setFri(q2);
        q2.sendMessage("你好我是李四");
        q3.sendMessage("你好我是王五");
        q2.displayInfo();
        q3.displayInfo();
    }

}
