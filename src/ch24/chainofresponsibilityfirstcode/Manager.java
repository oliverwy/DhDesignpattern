package ch24.chainofresponsibilityfirstcode;

public class Manager {
	protected String name;

	public Manager(String name) {
		super();
		this.name = name;
	}
	public void getResult(String managerLevel ,Request request)
	{
		if (managerLevel=="经理") {
			if (request.getRequestType()=="请假" && request.getNumber()<=2)
			{
				System.out.printf("\n%s:%s数量%s天 被批准",name,request.getRequestContent(),request.getNumber());
				
			}
			else
			{
				System.out.printf("\n%s:%s数量%s 我无权处理",name,request.getRequestContent(),request.getNumber());
			}
		}
		else if(managerLevel=="总监")
		{
			if (request.getRequestType()=="请假" && request.getNumber()<=5)
			{
				System.out.printf("\n%s:%s数量%s天 被批准",name,request.getRequestContent(),request.getNumber());
				
			}
			else
			{
				System.out.printf("\n%s:%s数量%s 我无权处理",name,request.getRequestContent(),request.getNumber());
			}
			
		}
		else if(managerLevel=="总经理")
		{
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

	}
}
