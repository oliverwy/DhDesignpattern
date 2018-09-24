package ch22.brigepatternthree;

public class Client {
	public static void main(String[] args)
	{
		HandsetBrand ab=null;
		ab=new HandsetMAdresslist();
		ab.run();
		ab=new HandsetNAdresslist();
		ab.run();
		
		ab=new HandsetMGame();
		ab.run();
		ab=new HandsetNGame();
		ab.run();
	}

}
