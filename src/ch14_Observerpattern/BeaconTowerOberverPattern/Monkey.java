package ch14_Observerpattern.BeaconTowerOberverPattern;

public class Monkey implements Oberver{
	private String name;
	private Observable observable;

	public Monkey(String name, Observable observable) {
		super();
		this.name = name;
		this.observable = observable;
	}

	public Monkey(String name) {
		super();
		this.name = name;
	}

	@Override
	public void enterBeaconTower(Observable beaconTower) {
		// TODO Auto-generated method stub
		beaconTower.attach(this);
	}

	@Override
	public void leaveBeaconTower(Observable beaconTower) {
		// TODO Auto-generated method stub
		beaconTower.detach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("吱吱吱");
	}

}
