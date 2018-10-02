package ch21singletonpattern.multithreadSingletonTwolock;

public class Singleton {
	private static Singleton instance;
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance==null)
					instance = new Singleton();
			}
		}
		return instance;
	}
	public Singleton() {
		super();
		System.out.println(""
				+ "创建Singleton:"+System.nanoTime());
	}
}
