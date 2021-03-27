package ch15_abstractfactorypattern.suitdemo.abstractfactory;

public interface IMaleDress {
	public void sell();
}

class ManSuit implements IMaleDress{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售男套装！！");
	}
	
}

class ManShoes implements IMaleDress{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售男鞋子！！");
	}
	
}

class ManTie implements IMaleDress{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("销售男领带！！");
	}
	
}

