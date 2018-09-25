package ch25.mediatorpatternunion;

public class USA extends Country implements CountryAction {

	public USA(UnitedNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void declare(String message) {
		// TODO Auto-generated method stub
		mediator.declare(message, this);
	}

	@Override
	public void getMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("美国获得了对方的消息："+message);
	}

}

class Iraq extends Country implements CountryAction {

	public Iraq(UnitedNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void declare(String message) {
		// TODO Auto-generated method stub
		mediator.declare(message, this);
	}

	@Override
	public void getMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println("伊拉克获得了对方的消息："+message);
	}

}
