package ch18mementopattern.normalmemento;

public class Originator {
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private String state;
	
	public Memento createMemento()
	{
		return new Memento(state);
	}
	public void setMemento(Memento memento)
	{
		state=memento.getState();
	}
	public void show()
	{
		System.out.println("state="+state);
	}
}

class Memento
{

	private String state;

	public Memento(String state) {
		super();
		this.state = state;
	}
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}

class Caretaker
{
	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	private Memento memento;
	
}


