package ch14_Observerpattern.BeaconTowerSecondCode;

import java.util.ArrayList;
import java.util.List;

public class BeaconTower {
    private String state;
    private List<Troop> Troops = new ArrayList<Troop>();//范围的军队
    private List<BusinessMan> businessMans=new ArrayList<BusinessMan>();//范围内商人
    private List<RearServicesUnit> rearServicesUnits=new ArrayList<RearServicesUnit>(); 
    public void Attach(RearServicesUnit tp) {
    	rearServicesUnits.add(tp);
    }
    public void detach(RearServicesUnit tp) {
    	rearServicesUnits.remove(tp);
    }
    public void Attach(Troop tp) {
    	Troops.add(tp);
    }
    public void detach(Troop tp) {
    	Troops.remove(tp);
    }
    public void Attach(BusinessMan tp) {
    	businessMans.add(tp);
    }
    public void detach(BusinessMan tp) {
    	businessMans.remove(tp);
    }
    public void notifys() { //通知军队
        System.out.println("\n烽火台状态改变，开始新一轮的通知：");
    	for (Troop o : Troops) {
            o.Update();
        }
        for (BusinessMan o:businessMans)
        {
        	o.Update();
        }
        for (RearServicesUnit o:rearServicesUnits)
        {
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
