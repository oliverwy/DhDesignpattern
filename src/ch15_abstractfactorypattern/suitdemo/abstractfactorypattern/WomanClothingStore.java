package ch15_abstractfactorypattern.suitdemo.abstractfactorypattern;

public class WomanClothingStore {
//开女鞋店
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iCreator ff=null;
		ff=new WomanCreator();
		iSuit mSuit=ff.factoryA();
		iShoes mShoes=ff.factoryB();
		iTie mTie =ff.factoryC();
		mSuit.sell();
		mShoes.sell();
		mTie.sell();
	}
}
