package ch14_Observerpattern.BeaconTowerSecondCode;

public class BusinessMan {
    private String name;
    private BeaconTower sub;
    public void enterBeaconTower(BeaconTower beaconTower) {
    	sub=beaconTower;
    	sub.Attach(this);//能观察到确定烽火台的信号
    }
    public void leaveBeaconTower(BeaconTower beaconTower) {
    	beaconTower.detach(this);//去别的区域
    	sub=null;//离开之后显然没有烽火台能通知他
    }
    public BusinessMan(String name) {
		super();
		this.name = name;//流动商人，可以全国到处跑，但是肯定会有商队编号
	}
	public BusinessMan(String name, BeaconTower sub) {
        super();
        this.name = name; //本地商人，不能移动
        this.sub = sub;//可以观察到本地的烽火台
    }
    public void Update() {//收到信号，会做出与信号相异的动作
        System.out.printf("%s 收到 %s，商人开始逃离！\n ",name , sub.getState());
    }
}
