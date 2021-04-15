package ch20_iteratorpattern.TVdemo;

public interface TvIterator {
    public abstract Chanel firstChanel();// so

    public abstract Chanel priorChanel();

    public abstract Chanel nextChanel();

    public abstract Chanel currentChanel();

    public abstract Chanel getSpecifyChanel(int i);

    public abstract int initChanel();

    public abstract void insertChanel(int index, Chanel value);

    public abstract void removeChanel(int index);
}
