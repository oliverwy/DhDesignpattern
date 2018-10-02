package ch22brigepattern.loosecouplingcode;


public abstract class HandsetSoftware {
	public abstract void run();
}

class HandsetGame extends HandsetSoftware
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("运行手机游戏");
	}
	
}

class HandsetAdressList extends HandsetSoftware
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("运行手机通讯录");
	}
	
}

abstract class HandsetBrand
{
	public HandsetSoftware getSoftware() {
		return software;
	}

	public void setSoftware(HandsetSoftware software) {
		this.software = software;
	}

	protected HandsetSoftware software;
	
	public abstract void run ();
}

class HandsetBrandN extends HandsetBrand
{

	public HandsetBrandN() {
		super();
		System.out.println("品牌N");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		software.run();
	}
}

class HandsetBrandM extends HandsetBrand
{

	public HandsetBrandM() {
		super();
		System.out.println("品牌M");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		software.run();
	}
}

class HandsetMP3 extends HandsetSoftware
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("运行MP3播放软件");
	}
	
}