package ch15_abstractfactorypattern.suitdemo.simplefactory;

public class Store {

	public static void main(String[] args) { 
		//生产力提高了，店面只负责买卖了，
		//当需要什么货物的时候，会有一个人专门负责把店面的需求传到工厂
		//然后把工厂制造好的产品拿到店面卖，店面只负责销售
		//调度呢，负责根据店面需求，通知后面的工人制造
		// TODO Auto-generated method stub
		iSell goodSell=null;
		goodSell=SimpleFactory.getGoods("manShoes");
		goodSell.sell();
		goodSell=SimpleFactory.getGoods("manSuit");
		goodSell.sell();
		goodSell=SimpleFactory.getGoods("womanShoes");
		goodSell.sell();
		goodSell=SimpleFactory.getGoods("womanSuits");
		goodSell.sell();
		goodSell=SimpleFactory.getGoods("manTie");
		goodSell.sell();
		goodSell=SimpleFactory.getGoods("womanTie");
		goodSell.sell();
	}

}
