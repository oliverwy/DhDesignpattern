package ch7.noproxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolGirl jiaojiao=new SchoolGirl();
		jiaojiao.setName("李娇娇");
		Pursuit zhuojiayi=new Pursuit(jiaojiao);
		
		zhuojiayi.GiveDolls();
		zhuojiayi.GiveFlowers();
		zhuojiayi.GiveChocolate();
	}

}
