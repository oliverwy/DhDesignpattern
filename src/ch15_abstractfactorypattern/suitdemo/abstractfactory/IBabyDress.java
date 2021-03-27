package ch15_abstractfactorypattern.suitdemo.abstractfactory;

public interface IBabyDress {
	public void sell();
}

class BabyClothing implements IBabyDress{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售婴儿服饰");
	}
	
}