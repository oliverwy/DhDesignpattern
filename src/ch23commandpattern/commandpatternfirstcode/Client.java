package ch23commandpattern.commandpatternfirstcode;

public class Client {
	public static void main(String[] args)
	{
		Barbecuer boy=new Barbecuer();
		boy.bakeMutton();
		boy.bakeMutton();
		boy.bakeMutton();
		boy.bakeChickenWing();
		boy.bakeMutton();
		boy.bakeMutton();
		boy.bakeChickenWing();
	}
}
