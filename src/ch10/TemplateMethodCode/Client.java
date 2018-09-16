package ch10.TemplateMethodCode;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass c;
		c=new ConcreteClassA();
		c.templateMethod();
		
		c=new ConcreteClassB();
		c.templateMethod();
	}

}
