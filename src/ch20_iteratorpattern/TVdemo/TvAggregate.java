package ch20_iteratorpattern.TVdemo;

public interface TvAggregate {
    public abstract TvIterator bindIterator();

    public Chanel getChanel(int index);

    public void initChanel();

    public void insertChanel(int index, Chanel value);

    public void removeChanel(int index);
}
