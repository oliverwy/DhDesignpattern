package ch20_iteratorpattern.iteratorReverseOrder;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList<Object>();

    @Override
    public Iterator CreateIterator() {
        // TODO Auto-generated method stub
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object getItem(int index) {
        return items.get(index);
    }

    public void insert(int index, Object value) {
        items.add(index, value);
    }
}
