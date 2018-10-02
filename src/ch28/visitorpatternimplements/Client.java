package ch28.visitorpatternimplements;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectStructure o=new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());
		
		Sucess v1=new Sucess();
		o.display(v1);
		
		Fail v2=new Fail();
		o.display(v2);
		
		Amativeness v3=new Amativeness();
		o.display(v3);
		
		Marriage v4=new Marriage();
		o.display(v4);
	}

}
