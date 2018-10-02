package ch14Observerpattern.firstdecouple;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secretary tongzhizhe=new Secretary();
		StockObserver tongshi1=new StockObserver("魏延", tongzhizhe);
		StockObserver tongshi2=new StockObserver("张飞", tongzhizhe);
		tongzhizhe.Attach(tongshi1);
		tongzhizhe.Attach(tongshi2);
		
		tongzhizhe.SecretaryAction="老板刘备和助理诸葛亮回来了！";
		tongzhizhe.notifys();
	}

}
