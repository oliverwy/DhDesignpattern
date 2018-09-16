package ch9.prototype;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototype p1=new ConcretePrototype("I");
		ConcretePrototype c1=(ConcretePrototype) p1.Clone();
		System.out.printf("Cloned:%s",c1.getId());

	}

}
