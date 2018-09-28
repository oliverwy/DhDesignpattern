package ch21.multithreadSingletonsynchronized;

public class Singleton {
	private static Singleton instance;
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public Singleton() {
		super();
		System.out.println(""
				+ "创建Singleton:"+System.nanoTime());
	}
}
