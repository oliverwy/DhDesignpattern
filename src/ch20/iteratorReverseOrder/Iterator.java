package ch20.iteratorReverseOrder;

public interface Iterator {
	public abstract Object first();
	public abstract Object next();
	public abstract boolean isDone();
	public abstract Object currentItem();
}
