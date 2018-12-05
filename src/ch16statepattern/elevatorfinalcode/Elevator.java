package ch16statepattern.elevatorfinalcode;

public class Elevator {
	private AbstactStateInterface state;
	public AbstactStateInterface getState() {
		return state;
	}
	public void setState(AbstactStateInterface state) {
		this.state = state;
	}
	public void open()
	{
		this.state.open();
	}
	public void close()
	{
		this.state.close();
	}
	public void start()
	{
		this.state.start();
	}
	public void stop()
	{
		this.state.stop();
	}
}
