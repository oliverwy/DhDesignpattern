package ch15_abstractfactorypattern.suitdemo.abstractfactory;

public class ClothingStore {
//综合商店
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExclusiveShop ib=null;
		ib=new ManyKindShop();
		IBabyDress ibd=ib.purchaseBabyDress();
		IFemaleDress ifd=ib.purchaseFemaleDress();
		IMaleDress imd=ib.purchaseMaleDress();
		
		ibd.sell();
		ifd.ADShow();
		ifd.sell();
		imd.sell();
	}

}
