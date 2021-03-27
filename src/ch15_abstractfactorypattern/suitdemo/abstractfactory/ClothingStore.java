package ch15_abstractfactorypattern.suitdemo.abstractfactory;

public class ClothingStore {
//综合商店
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAbstractFactory ib=null;
		ib=new ManyKindFactory();
		IBabyDress ibd=ib.createBabyDressObj();
		IFemaleDress ifd=ib.createFemaleDressObj();
		IMaleDress imd=ib.createMaleDressObj();
		
		ibd.sell();
		ifd.ADShow();
		ifd.sell();
		imd.sell();
	}

}
