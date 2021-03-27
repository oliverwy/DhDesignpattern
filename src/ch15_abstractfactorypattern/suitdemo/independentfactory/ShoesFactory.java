package ch15_abstractfactorypattern.suitdemo.independentfactory;

public interface ShoesFactory {
	public IShoes getShoesObj();
}

class ManShoesFactory implements ShoesFactory {

	@Override
	public IShoes getShoesObj() {
		// TODO Auto-generated method stub
		return new ManShoes();
	}

}

class WomenShoesFactory implements ShoesFactory {

	@Override
	public IShoes getShoesObj() {
		// TODO Auto-generated method stub
		return new WomanShoes();
	}

}

interface SuitFactory {
	public iSuit getSuitObj();
}

class ManSuitFactory implements SuitFactory {

	@Override
	public iSuit getSuitObj() {
		// TODO Auto-generated method stub
		return new ManSuit();
	}

}

class WomenSuitFactory implements SuitFactory {

	@Override
	public iSuit getSuitObj() {
		// TODO Auto-generated method stub
		return new WomanSuit();
	}

}

interface TieFactory {
	public iTie getTieObj();
}

class ManTieFactory implements TieFactory {

	@Override
	public iTie getTieObj() {
		// TODO Auto-generated method stub
		return new ManTie();
	}

}

class WomenTieFactory implements TieFactory {

	@Override
	public iTie getTieObj() {
		// TODO Auto-generated method stub
		return new WomanTie();
	}

}
