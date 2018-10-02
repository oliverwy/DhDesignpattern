package ch19.Compositefirstcode;

public abstract class Component {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected String name;

	public Component(String name) {
		super();
		this.name = name;
	}
	public abstract void  add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depth);
}