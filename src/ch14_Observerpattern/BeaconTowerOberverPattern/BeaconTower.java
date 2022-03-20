package ch14_Observerpattern.BeaconTowerOberverPattern;

import java.util.ArrayList;
import java.util.List;

public class BeaconTower extends Observable {
	private String state;
	private List<Oberver> oberveres = new ArrayList<Oberver>();// 范围的军队
	public void attach(Oberver tp) {
		oberveres.add(tp);
	}
	public void detach(Oberver tp) {
		oberveres.remove(tp);
	}
	public void notifys() { // 通知军队
		System.out.println("\n烽火台状态改变，开始新一轮的通知：");
		for (Oberver o : oberveres) {
			o.update();
		}
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
		notifys();
	}
}
