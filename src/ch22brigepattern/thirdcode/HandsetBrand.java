package ch22brigepattern.thirdcode;

public abstract class HandsetBrand {
	public abstract void run();
}

class HandsetBrandM extends HandsetBrand
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("M品牌");
	}
	
}

class HandsetBrandN extends HandsetBrand
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("N品牌");
	
	}
	
}

class HandsetMGame extends HandsetBrandM
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("运行M品牌手机游戏");

	}
	
}
class HandsetNGame extends HandsetBrandN
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("运行N品牌手机游戏");
	}
	
}

class HandsetMAdresslist extends HandsetBrandM
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("运行M品牌电话簿");

	}
	
	
}
class HandsetNAdresslist extends HandsetBrandN
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("运行N品牌电话簿");

	}
	
}