package ch22.brigepatternTwo;

abstract class HandsetGame {
	public abstract void run();
}

public class HandsetNGame extends HandsetGame
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("运行N品牌手机游戏");
	}
	
}

class HandsetMGame extends HandsetGame
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("运行M品牌手机游戏");

	}
	
}