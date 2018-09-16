package chh8.Leifengfactory;

public class FactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ifactory factory=new UnderGraduateFactory();
		LeiFeng student=factory.CreateLeifeng();
		student.BuyRice();
		student.Sweep();
		student.Wash();
	}

}
