package ch20iteratorpattern.firstcode;

public interface Iterator {
    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();
}
