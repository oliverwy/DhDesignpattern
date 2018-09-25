package ch24.chainofresponsibilitythirdcode;


public abstract class Manager {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manager getSuperior() {
		return superior;
	}
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
	protected String name;
	protected Manager superior;
	public Manager(String name) {
		super();
		this.name = name;
	}
	abstract public void requestApplications(Request reguest);
}

class CommonManager extends Manager
{

	@Override
	public void requestApplications(Request reguest) {
		// TODO Auto-generated method stub
		if (reguest.getRequestType()=="请假" && reguest.getNumber()<=2)
		{
			System.out.printf("\n%s:%s数量%s天 被批准",name,reguest.getRequestContent(),reguest.getNumber());
			
		}
		else
		{
			if (superior!=null)
			{
				superior.requestApplications(reguest);
			}
		}
		
	}

	public CommonManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

class MajorDemo extends Manager
{

	@Override
	public void requestApplications(Request reguest) {
		// TODO Auto-generated method stub
		if (reguest.getRequestType()=="请假" && reguest.getNumber()<=5)
		{
			System.out.printf("\n%s:%s数量%s天 被批准",name,reguest.getRequestContent(),reguest.getNumber());
			
		}
		else
		{
			if (superior!=null)
			{
				superior.requestApplications(reguest);
			}
		}
		
	}

	public MajorDemo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
class GeneralManager extends Manager
{

	@Override
	public void requestApplications(Request request) {
		// TODO Auto-generated method stub
		if (request.getRequestType()=="请假" )
		{
			System.out.printf("\n%s:%s数量%s天 被批准",name,request.getRequestContent(),request.getNumber());
			
		}
		else if(request.getRequestType()=="加薪" && request.getNumber()<=500)
		{
			System.out.printf("\n%s:%s数量%s 被批准",name,request.getRequestContent(),request.getNumber());
		}
		else if (request.getRequestType()=="加薪" && request.getNumber()>500)
		{
			System.out.printf("\n%s:%s数量%s 在说吧",name,request.getRequestContent(),request.getNumber());

		}
		
	}

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

