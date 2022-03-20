package ch14_Observerpattern.BeaconTowerOberverPattern;


public interface Oberver {
	abstract public void enterBeaconTower(Observable beaconTower);
	abstract public void leaveBeaconTower(Observable beaconTower);
	abstract public void update();
}
