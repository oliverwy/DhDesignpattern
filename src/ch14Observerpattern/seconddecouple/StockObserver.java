package ch14Observerpattern.seconddecouple;

public class StockObserver extends Observer
{

	public StockObserver(String name, Subject sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s关闭股票行情，继续工作\n ", sub.getSubjectState(), name);
	}
	
}