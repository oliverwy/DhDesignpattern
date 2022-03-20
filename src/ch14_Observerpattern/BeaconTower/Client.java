package ch14_Observerpattern.BeaconTower;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeaconTower beaconTower=new BeaconTower();//为了预防外敌入侵，卫青建立一个烽火台
		Troop t1=new Troop("010201", beaconTower);//为了抵御外敌部署了编号为
		Troop t2=new Troop("010202", beaconTower);//为了抵御外敌部署了编号为
		beaconTower.Attach(t1);//直接驻扎在该烽火台的范围
		beaconTower.Attach(t2);//直接驻扎在该烽火台的范围
		System.out.println("\n敌人来袭！！！！！");
		beaconTower.setState("发现敌情，烧起黑色狼烟"); 
		
		System.out.println("\n战事紧张，友军来协防");
		Troop t3=new Troop("部队三");
		t3.enterBeaconTower(beaconTower); //战事吃紧，从外地调来来增援军
		System.out.println("\n增加防守力量后，又有情况发生，我们协同战斗");
		beaconTower.setState("发现敌情，烧起黑色狼烟"); 
		
		System.out.println("\n打完仗，友军撤离！");
		t3.leaveBeaconTower(beaconTower);//打完仗，人家回去了
		System.out.println("\n增援军离开后，又有敌军来犯");
		beaconTower.setState("又有敌军来犯，烧起黑色狼烟");
		
		System.out.println("\n本地压力不大，010202增援其他区域去了！");
		t2.leaveBeaconTower(beaconTower);//本地已经和平，调离一只部队
		beaconTower.setState("部队二离开后，又有敌军来犯");
	}
}
