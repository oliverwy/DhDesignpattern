package ch15_abstractfactorypattern.suitdemo.abstractfactorypattern;

public interface iShoes {
	public void sell();
}

interface iSuit{
	public void sell();

}

interface iTie{
	public void sell();

}

class ManShoes implements iShoes{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售男鞋！！");
	}
	
}

class WomanShoes implements iShoes{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售女鞋！！");
		
	}
	
}

class ManSuit implements iSuit{
	@Override
	public void sell() {
		System.out.println("销售男套装！！");
	}
}

class WomanSuit implements iSuit{
	@Override
	public void sell() {
		System.out.println("销售女套装！！");
	}
}

class ManTie implements iTie{

	@Override
	public void sell() {
		System.out.println("销售男领带！！");
	}
}

class WomanTie implements iTie{
	@Override
	public void sell() {
		System.out.println("销售女领带！！");
	}
}