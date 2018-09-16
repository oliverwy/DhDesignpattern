package ch8.Leifengfactory;

public class SimpleFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeiFeng studentA = SimpleFactory.createLeiFeng("学雷锋的大学生");
		studentA.BuyRice();
		LeiFeng studentB = SimpleFactory.createLeiFeng("社区志愿者");
		studentB.Sweep();
		LeiFeng studentc = SimpleFactory.createLeiFeng("学雷锋的大学生");
		studentc.Wash();
		LeiFeng studentd = SimpleFactory.createLeiFeng("社区志愿者");
		studentc.BuyRice();
	}

}
