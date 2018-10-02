package ch21singletonpattern.privateSingletonFactory;

public class Singleton {
	public static Singleton getInstance() {
		return SingletonFactory.singletonInstance;
	}
	public Singleton() {
		super();
		System.out.println(""
				+ "创建Singleton:"+System.nanoTime());
	}
	private static class SingletonFactory{
		private static Singleton 
		singletonInstance=new Singleton();
	}
}
