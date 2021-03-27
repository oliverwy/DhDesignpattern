package ch15_abstractfactorypattern.suitdemo.abstractfactory;

public interface IAbstractFactory {
	public IMaleDress createMaleDressObj();
	public IFemaleDress createFemaleDressObj();
	public IBabyDress createBabyDressObj();
}

class SuitFactory implements IAbstractFactory{

	@Override
	public IMaleDress createMaleDressObj() {
		// TODO Auto-generated method stub
		return new ManSuit();
	}

	@Override
	public IFemaleDress createFemaleDressObj() {
		// TODO Auto-generated method stub
		return new WomanSuit();
	}

	@Override
	public IBabyDress createBabyDressObj() {
		// TODO Auto-generated method stub
		return new BabyClothing();
	}
	
}

class ShoesFactory implements IAbstractFactory{

	@Override
	public IMaleDress createMaleDressObj() {
		// TODO Auto-generated method stub
		return new ManShoes();
	}

	@Override
	public IFemaleDress createFemaleDressObj() {
		// TODO Auto-generated method stub
		return new WomanShoes();
	}

	@Override
	public IBabyDress createBabyDressObj() {
		// TODO Auto-generated method stub
		return new BabyClothing();
	}
	
}

class TieFactory implements IAbstractFactory{

	@Override
	public IMaleDress createMaleDressObj() {
		// TODO Auto-generated method stub
		return new ManTie();
	}

	@Override
	public IFemaleDress createFemaleDressObj() {
		// TODO Auto-generated method stub
		return new WomanTie();
	}

	@Override
	public IBabyDress createBabyDressObj() {
		// TODO Auto-generated method stub
		return new BabyClothing();
	}
	
}

class ManyKindFactory implements IAbstractFactory{

	@Override
	public IMaleDress createMaleDressObj() {
		// TODO Auto-generated method stub
		return new ManTie();
	}

	@Override
	public IFemaleDress createFemaleDressObj() {
		// TODO Auto-generated method stub
		return new WomanShoes();
	}

	@Override
	public IBabyDress createBabyDressObj() {
		// TODO Auto-generated method stub
		return new BabyClothing();
	}
	
}