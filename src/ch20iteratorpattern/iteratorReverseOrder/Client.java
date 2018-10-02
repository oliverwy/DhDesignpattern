package ch20iteratorpattern.iteratorReverseOrder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate a=new ConcreteAggregate();
		a.insert(0, "大鸟");
		a.insert(1, "小菜");
		a.insert(2, "行李");
		a.insert(3, "老外");
		a.insert(4, "公司内部员工");
		a.insert(5, "小偷");
		a.insert(6, "乘客A");
		a.insert(7, "乘客B");
		a.insert(8, "老人");
		
		Iterator i=new ConcreteIterator(a);
		Object item =i.first();
		while (!i.isDone())
		{
			System.out.printf("\n%s请买车票", i.currentItem());
			i.next();
		}
	}

}
