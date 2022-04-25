package ch15_abstractfactorypattern.suitdemo.protype;

public interface iSell {
	public void sell();
}

class ManShoes implements iSell{
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售男鞋！！");
	}
}

class WomanShoes implements iSell{
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售女鞋！！");
		
	}
}

class ManSuit implements iSell{
	@Override
	public void sell() {
		System.out.println("销售男套装！！");
	}
}

class WomanSuit implements iSell{
	@Override
	public void sell() {
		System.out.println("销售女套装！！");
	}
}

class ManTie implements iSell{

	@Override
	public void sell() {
		System.out.println("销售男领带！！");
	}
}

class WomanTie implements iSell{
	@Override
	public void sell() {
		System.out.println("销售女领带！！");
	}
}