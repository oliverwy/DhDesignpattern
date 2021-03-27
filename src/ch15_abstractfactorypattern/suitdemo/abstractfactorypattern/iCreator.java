package ch15_abstractfactorypattern.suitdemo.abstractfactorypattern;

public interface iCreator {
	public iSuit factoryA();
	public iShoes factoryB();
	public iTie factoryC();
}


class ManCreator implements iCreator{
	@Override
	public iSuit factoryA() {
		return new ManSuit();
	}

	@Override
	public iShoes factoryB() {
		return new ManShoes();
	}

	@Override
	public iTie factoryC() {
		return new ManTie();
	}
}

class WomanCreator implements iCreator{

	@Override
	public iSuit factoryA() {
		return new WomanSuit();
	}

	@Override
	public iShoes factoryB() {
		return new WomanShoes();
	}

	@Override
	public iTie factoryC() {
		return new WomanTie();
	}
	
}