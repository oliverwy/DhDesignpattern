package ch22brigepattern.brigepatternnormal;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction ab=new RefinedAbstraction();
		ab.setImplementor(new ConcreteImplementA());
		ab.operation();
		
		ab.setImplementor(new ConcreteImplementB());
		ab.operation();
	}

}
