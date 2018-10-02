package ch17adapterpattern.firstcode;

public class Target {
	public void request()
	{
		System.out.println("普通请求");
	}
}

class Adaptee
{
	public void specialRequest()
	{
		System.out.println("特殊请求");
	}
}

class Adapter extends Target
{
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specialRequest();
	}

	private Adaptee adaptee =new Adaptee();
	
}
