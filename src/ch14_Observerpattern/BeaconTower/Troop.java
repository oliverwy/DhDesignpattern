package ch14_Observerpattern.BeaconTower;
public class Troop {
    private String name;
    private BeaconTower sub;
    public void enterBeaconTower(BeaconTower beaconTower) {
    	beaconTower.Attach(this);//到防地了，现在就能观察到确定烽火台的信号
    	sub=beaconTower;
    }
    public void leaveBeaconTower(BeaconTower beaconTower) {
    	beaconTower.dettach(this);//换防了，去别的区域防御敌人了
    	sub=null;//移动过程中显然没有烽火台能通知他
    }
    public Troop(String name) {
		super();
		this.name = name;//流动部队，可以全国到处增援，但是肯定会有部队编号
	}
	public Troop(String name, BeaconTower sub) {
        super();
        this.name = name; //固定建制部队，类似过去的边防镇守部队，不能移动
        this.sub = sub;//一完成建制就可以观察到确定的烽火台
        sub.Attach(this);
    }
    public void Update() {//收到信号，会做出与信号相异的动作
        System.out.printf("%s 收到 %s，现在开发进发准备抗敌！\n ",name , sub.getState());
    }
}
