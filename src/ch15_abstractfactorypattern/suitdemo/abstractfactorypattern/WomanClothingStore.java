package ch15_abstractfactorypattern.suitdemo.abstractfactorypattern;

public class WomanClothingStore {
//开女鞋店
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExclusiveShop ff=null;
		ff=new WomanExclusiveShop();
		iSuit mSuit=ff.purchaseSuit();
		iShoes mShoes=ff.purchaseShoes();
		iTie mTie =ff.purchaseTie();
		mSuit.sell();
		mShoes.sell();
		mTie.sell();
	}
}
