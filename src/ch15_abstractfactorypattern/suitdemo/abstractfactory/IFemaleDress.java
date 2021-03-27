package ch15_abstractfactorypattern.suitdemo.abstractfactory;

public interface IFemaleDress {
	public void sell();
	public void ADShow();
}

class WomanSuit implements IFemaleDress{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售女套装！！");
	}

	@Override
	public void ADShow() {
		// TODO Auto-generated method stub
		System.out.println("现场广告展示女套装！！");
		
	}

}
class WomanShoes implements IFemaleDress{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售女鞋子！！");
	}

	@Override
	public void ADShow() {
		// TODO Auto-generated method stub
		System.out.println("现场广告展示女鞋子！！");
	}

	
}
class WomanTie implements IFemaleDress{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售女领带！！");
	}

	@Override
	public void ADShow() {
		// TODO Auto-generated method stub
		System.out.println("现场广告展示女领带！！");
	}
	
}