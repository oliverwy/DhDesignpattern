package ch25mediatorpattern.mediatorpattern;

public interface Colleague
{	
	public void send(String message);
	public void notifys(String message);
}

abstract class cColleague implements Colleague {


	protected Mediator mediator;

	public cColleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
}

class ConcreteColleague1 extends cColleague
{
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	public void send(String message)
	{
		mediator.send(message, this);
	}
	public void notifys(String string)
	{
		System.out.println("同事1得到信息："+string);
	}
}
class ConcreteColleague2 extends cColleague
{
	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	public void send(String message)
	{
		mediator.send(message, this);
	}
	public void notifys(String string)
	{
		System.out.println("同事2得到信息："+string);
	}
}
