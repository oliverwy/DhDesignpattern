package ch15_abstractfactorypattern.suitdemo.abstractfactory;

public interface ExclusiveShop {
	public IMaleDress purchaseMaleDress();
	public IFemaleDress purchaseFemaleDress();
	public IBabyDress purchaseBabyDress();
}

class SuitShop implements ExclusiveShop{

	@Override
	public IMaleDress purchaseMaleDress() {
		// TODO Auto-generated method stub
		return new ManSuit();
	}

	@Override
	public IFemaleDress purchaseFemaleDress() {
		// TODO Auto-generated method stub
		return new WomanSuit();
	}

	@Override
	public IBabyDress purchaseBabyDress() {
		// TODO Auto-generated method stub
		return new BabyClothing();
	}
	
}

class ShoesShop implements ExclusiveShop{

	@Override
	public IMaleDress purchaseMaleDress() {
		// TODO Auto-generated method stub
		return new ManShoes();
	}

	@Override
	public IFemaleDress purchaseFemaleDress() {
		// TODO Auto-generated method stub
		return new WomanShoes();
	}

	@Override
	public IBabyDress purchaseBabyDress() {
		// TODO Auto-generated method stub
		return new BabyClothing();
	}
	
}

class TieShop implements ExclusiveShop{

	@Override
	public IMaleDress purchaseMaleDress() {
		// TODO Auto-generated method stub
		return new ManTie();
	}

	@Override
	public IFemaleDress purchaseFemaleDress() {
		// TODO Auto-generated method stub
		return new WomanTie();
	}

	@Override
	public IBabyDress purchaseBabyDress() {
		// TODO Auto-generated method stub
		return new BabyClothing();
	}
	
}

class ManyKindShop implements ExclusiveShop{

	@Override
	public IMaleDress purchaseMaleDress() {
		// TODO Auto-generated method stub
		return new ManTie();
	}

	@Override
	public IFemaleDress purchaseFemaleDress() {
		// TODO Auto-generated method stub
		return new WomanShoes();
	}

	@Override
	public IBabyDress purchaseBabyDress() {
		// TODO Auto-generated method stub
		return new BabyClothing();
	}
	
}