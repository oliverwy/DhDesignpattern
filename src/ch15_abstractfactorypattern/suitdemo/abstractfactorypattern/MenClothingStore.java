package ch15_abstractfactorypattern.suitdemo.abstractfactorypattern;

public class MenClothingStore {
//开男鞋店
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExclusiveShop ff=null;
		ff=new ManExclusiveShop();
		iSuit mSuit=ff.purchaseSuit();
		iShoes mShoes=ff.purchaseShoes();
		iTie mTie =ff.purchaseTie();
		mSuit.sell();
		mShoes.sell();
		mTie.sell();

	}

}
