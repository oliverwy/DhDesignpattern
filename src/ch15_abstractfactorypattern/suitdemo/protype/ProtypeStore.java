package ch15_abstractfactorypattern.suitdemo.protype;

public class ProtypeStore {  //原始商店，自己造自己卖

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManShoes manShoes=new ManShoes();
		manShoes.sell();
		WomanShoes womanShoes=new WomanShoes();
		womanShoes.sell();
		ManSuit manSuit=new ManSuit();
		manSuit.sell();
		WomanSuit womanSuit =new WomanSuit();
		womanSuit.sell();
		ManTie manTie=new ManTie();
		manTie.sell();
		WomanTie womanTie=new WomanTie();
		manTie.sell();
	}

}
