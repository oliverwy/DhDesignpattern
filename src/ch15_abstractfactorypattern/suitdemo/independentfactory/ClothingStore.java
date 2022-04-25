package ch15_abstractfactorypattern.suitdemo.independentfactory;

public class ClothingStore {
//杂货店 生产力又提高了，量大了，干嘛，专门一个人负责一个产品的进货和调度
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoesFactory shoesf=null;
		SuitFactory suitf=null;
		TieFactory tief=null;
		
		shoesf=new ManShoesFactory();
		IShoes mshoesf=shoesf.getShoesObj();
		mshoesf.sell();
		
		suitf=new WomenSuitFactory();
		iSuit wsuitf=suitf.getSuitObj();
		wsuitf.sell();
		
		tief=new ManTieFactory();
		iTie mantief=tief.getTieObj();
		mantief.sell();
	}

}
