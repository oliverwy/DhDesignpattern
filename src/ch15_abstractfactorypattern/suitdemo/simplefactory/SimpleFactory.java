package ch15_abstractfactorypattern.suitdemo.simplefactory;

public class SimpleFactory { //
	public static iSell getGoods(String tyString) {
		if (tyString.equals("manShoes"))
			return new ManShoes();
		else if (tyString.equals("manSuit")) {
			return new ManSuit();
		} else if (tyString.equals("womanShoes")) {
			return new WomanShoes();
		} else if (tyString.equals("womanSuits")) {
			return new WomanSuit();
		} else if (tyString.equals("manTie")) {
			return new ManTie();
		} else {
			return new WomanTie();
		}
	}

}
