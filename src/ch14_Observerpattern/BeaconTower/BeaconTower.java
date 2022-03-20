package ch14_Observerpattern.BeaconTower;

import java.util.ArrayList;
import java.util.List;

public class BeaconTower {
	private String state;
	private List<Troop> Troops = new ArrayList<Troop>();// 范围的军队

	public void Attach(Troop tp) {
		Troops.add(tp);
	}

	public void dettach(Troop tp) {
		Troops.remove(tp);
	}

	public void notifys() { // 通知军队
		System.out.println("\n烽火台状态改变，开始新一轮的通知：");

		for (Troop o : Troops) {
			o.Update();
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
