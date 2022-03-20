package ch14_Observerpattern.BeaconTowerOberverPattern;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeaconTower beaconTower=new BeaconTower();//为了预防外敌入侵，卫青建立一个烽火台
		Troop t1=new Troop("010201", beaconTower);//为了抵御外敌部署了编号为
		Troop t2=new Troop("010202", beaconTower);//为了抵御外敌部署了编号为
		beaconTower.attach(t1);//直接驻扎在该烽火台的范围
		beaconTower.attach(t2);//直接驻扎在该烽火台的范围
		System.out.println("\n敌人来袭！！！！！");
		beaconTower.setState("发现敌情，烧起黑色狼烟");
		
		RearServicesUnit r1=new RearServicesUnit("后勤1");
		r1.enterBeaconTower(beaconTower);//外地调来的后勤部队
		beaconTower.notifys();
		
		BusinessMan b1=new BusinessMan("狗皮膏药商人",beaconTower);
		beaconTower.attach(b1);//本地商人
		beaconTower.notifys();
		
	
		b1.leaveBeaconTower(beaconTower); //本地商人跑路了
		beaconTower.notifys();
		
		Monkey m=new Monkey("金丝猴");
		m.enterBeaconTower(beaconTower);
		beaconTower.setState("燃烟");
		
	}
}
