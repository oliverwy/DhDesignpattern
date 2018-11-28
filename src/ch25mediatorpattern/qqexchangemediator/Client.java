package ch25mediatorpattern.qqexchangemediator;


public class Client {
	public static void main(String[] args) {
		QQqun quns=new ConcreteQQun();
		QQUser q1=new QQUser();
		QQUser q2=new QQUser();
		QQUser q3=new QQUser();
		q1.setsName("张三");
		q2.setsName("李四");
		q3.setsName("王五");
		q1.attachQun(quns);
		q2.attachQun(quns);
		q3.attachQun(quns);
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
		q3.detach(quns);
		q2.detach(quns);
		System.out.println(q1.sendMessage("王五", "我是张三"));
		q3.displayInfo();
		System.out.println(q1.sendMessage("李四", "你好啊，我是张三"));
		q2.displayInfo();
		q2.attachQun(quns);
		q3.attachQun(quns);
		q1.sendMessage("王五", "我是张三");
		q3.displayInfo();
		q1.sendMessage("李四", "你好啊，我是张三");
		q2.displayInfo();

	}

}
