package ch14.seconddecouple;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boss husanhan=new Boss();
		StockObserver tongshi1=new StockObserver("魏延", husanhan);
		StockObserver tongshi2=new StockObserver("张飞", husanhan);
		NbaObserver tongshi3=new NbaObserver("易冠茶", husanhan);
		
		husanhan.attach(tongshi1);
		husanhan.attach(tongshi2);
		husanhan.attach(tongshi3);
		
		husanhan.setSubjectState("我回来了，你们这帮兔崽子！");
		husanhan.notifys();
		
		
	}

}
