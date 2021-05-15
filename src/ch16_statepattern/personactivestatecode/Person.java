package ch16_statepattern.personactivestatecode;

public class Person {

	private AbstractState abstractState;
	
	public AbstractState getAbstractState() {
		return abstractState;
	}

	public void setAbstractState(AbstractState abstractState) {
		this.abstractState = abstractState;
	}
	public void hitByOther() {
		this.abstractState.hitByOther(this);
	}
	public void reciveApologyMessage() { ;
		this.abstractState.reciveApologyMessage(this);
	}
	public void reciveDefyMessage() {
		this.abstractState.reciveDefyMessage(this);
	}
	public void reciveHumorMessage() {
		this.abstractState.reciveHumorMessage(this);
	}
	public void slapByOther() {
		this.abstractState.slapByOther(this);
	}

}
