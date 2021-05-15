package ch16_statepattern.personactivestatecode;

public interface AbstractState {
	public void hitByOther(Person p);
	public void reciveApologyMessage(Person p) ;
	public void reciveDefyMessage(Person p) ;
	public void reciveHumorMessage(Person p) ;
	public void slapByOther(Person p) ;
}
