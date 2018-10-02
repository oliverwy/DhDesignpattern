package ch20iteratorpattern.firstcode;

public class ConcreteIterator implements Iterator {
	private ConcreteAggregate aggregate;
	private int current=0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggregate.getItem(0);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object ret=null;
		current++;
		if(current<aggregate.count())
		{
			ret=aggregate.getItem(current);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current>=aggregate.count() ? true:false;
	}

	@Override
	public Object currentItem() {
		// TODO Auto-generated method stub
		return aggregate.getItem(current);
	}

}
