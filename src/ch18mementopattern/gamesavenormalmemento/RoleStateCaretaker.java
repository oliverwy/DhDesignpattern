package ch18mementopattern.gamesavenormalmemento;

public class RoleStateCaretaker {
	private RoleStateMemento memento;
	public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}

}
