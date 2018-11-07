package ch20iteratorpattern.TVdemo;

public interface TvIterator {
	public abstract Chanel firstChanel();//so
	public abstract Chanel priorChanel();
	public abstract Chanel nextChanel();
	public abstract Chanel currentChanel();
	public abstract Chanel getSpecifyChanel(int i);
}
