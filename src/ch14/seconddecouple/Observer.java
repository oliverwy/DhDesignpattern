package ch14.seconddecouple;

public abstract class Observer{
	protected String name;
	protected Subject sub;
	public Observer(String name, Subject sub) {
		super();
		this.name = name;
		this.sub = sub;
	}
	public abstract void update();
}
