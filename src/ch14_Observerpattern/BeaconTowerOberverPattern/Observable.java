package ch14_Observerpattern.BeaconTowerOberverPattern;


public abstract class Observable {
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	abstract public void attach(Oberver ob);
	abstract public void detach(Oberver ob);
	abstract public void notifys();
}
