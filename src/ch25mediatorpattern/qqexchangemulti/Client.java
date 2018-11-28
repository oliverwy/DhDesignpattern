package ch25mediatorpattern.qqexchangemulti;
public class Client {

	public static void main(String[] args) {
		QQUser q1=new QQUser();
		QQUser q2=new QQUser();
		QQUser q3=new QQUser();
		q1.setsName("张三");
		q2.setsName("李四");
		q3.setsName("王五");
		q1.addFriend(q2);
		q1.addFriend(q2);
		q1.addFriend(q2);
		q1.addFriend(q2);
		q1.addFriend(q2);
		q1.addFriend(q2);
		q1.addFriend(q2);
		q1.addFriend(q3);
		q2.addFriend(q1);
		q2.addFriend(q3);
		q3.addFriend(q2);
		q3.addFriend(q1);
		q1.sendMessage("李四", "你好啊，我是张三");
		q2.displayInfo();
		q2.sendMessage("张三", "你也好啊！我是李四");
		q1.displayInfo();
		q2.sendMessage("王五", "你好啊，我李四") ;
		q3.displayInfo();
		q3.sendMessage("李四", "你好啊，我是王五");
		q2.displayInfo();
		q1.sendMessage("王五", "我是张三");
		q3.displayInfo();
		q3.sendMessage("张三", "我是王五");
		q1.displayInfo();
	}
}
