package ch12facadepattern.stock1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stock1 gu1=new stock1();
		stock2 gu2=new stock2();
		stock3 gu3=new stock3();
		NationalDebt1 nationalDebt1=new NationalDebt1();
		Realty1 rt1=new Realty1();
		gu1.buy();
		gu2.buy();
		gu3.buy();
		nationalDebt1.buy();
		rt1.buy();
		
		gu1.sell();
		gu2.sell();
		gu3.sell();
		nationalDebt1.sell();
		rt1.sell();
	}

}

interface stockaction
{
	abstract public void sell();
	abstract public void buy();
}
class stock1 implements stockaction
{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("股票一卖出");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("股票一买入");
		
	}
}

class stock2 implements stockaction
{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("股票2卖出");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("股票2买入");
		
	}
}

class stock3 implements stockaction
{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("股票3卖出");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("股票3买入");
		
	}
}
class NationalDebt1 implements stockaction
{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("NationalDebt1卖出");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("NationalDebt1买入");
		
	}
}

class Realty1 implements stockaction
{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Realty1卖出");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Realty1买入");
		
	}
}