package ch16statepattern.thirdcode;

public abstract class State {
	public abstract void handle(Context context);
}
class ConcreteStateA extends State
{

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateB());
	}
	
}

class ConcreteStateB extends State
{

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateA());
	}
	
}

class Context
{
	private State state;

	public Context(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println("当前状态"+state.getClass().getName());
	}
	public void request()
	{
		state.handle(this);
	}
}