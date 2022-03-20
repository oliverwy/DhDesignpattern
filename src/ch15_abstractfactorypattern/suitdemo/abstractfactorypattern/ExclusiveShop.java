package ch15_abstractfactorypattern.suitdemo.abstractfactorypattern;

public interface ExclusiveShop {
	public iSuit purchaseSuit();
	public iShoes purchaseShoes();
	public iTie purchaseTie();
}


class ManExclusiveShop implements ExclusiveShop{
	@Override
	public iSuit purchaseSuit() {
		return new ManSuit();
	}

	@Override
	public iShoes purchaseShoes() {
		return new ManShoes();
	}

	@Override
	public iTie purchaseTie() {
		return new ManTie();
	}
}

class WomanExclusiveShop implements ExclusiveShop{

	@Override
	public iSuit purchaseSuit() {
		return new WomanSuit();
	}

	@Override
	public iShoes purchaseShoes() {
		return new WomanShoes();
	}

	@Override
	public iTie purchaseTie() {
		return new WomanTie();
	}
	
}