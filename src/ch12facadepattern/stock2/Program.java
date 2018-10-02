package ch12facadepattern.stock2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fund jijin=new fund();
		
		jijin.buyFund();
		jijin.sellFund();
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

class fund
{
	stock1 gu1;
	stock2 gu2;
	stock3 gu3;
	NationalDebt1 nd1;
	Realty1 rt1;
	public fund() {
		gu1=new stock1();
		gu2=new stock2();
		gu3=new stock3();
		nd1=new NationalDebt1();
		rt1=new Realty1();		
	}
	
	public void buyFund()
	{
		gu1.buy();
		gu2.buy();
		gu3.buy();
		nd1.buy();
		rt1.buy();
	}
	
	public void sellFund()
	{
		gu1.sell();
		gu2.sell();
		gu3.sell();
		nd1.sell();
		rt1.sell();
	}
}