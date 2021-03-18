package ch20_iteratorpattern.iteratorReverseOrder;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        super();
        this.aggregate = aggregate;
        current = aggregate.count() - 1;
    }

    @Override
    public Object first() {
        // TODO Auto-generated method stub
        return aggregate.getItem(aggregate.count() - 1);
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        Object ret = null;
        current--;
        if (current >= 0) {
            ret = aggregate.getItem(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        // TODO Auto-generated method stub
        return current < 0 ? true : false;
    }

    @Override
    public Object currentItem() {
        // TODO Auto-generated method stub
        return aggregate.getItem(current);
    }

}
