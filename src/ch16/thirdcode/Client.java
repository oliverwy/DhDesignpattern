package ch16.thirdcode;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context c= new Context(new ConcreteStateA());
		c.request();
		c.request();
		c.request();
		c.request();
		c.request();
	}

}
