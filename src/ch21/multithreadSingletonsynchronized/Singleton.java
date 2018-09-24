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
		// TODO Auto-generated constructor stub
		System.out.println("创建Singleton:"+System.nanoTime());
	}

}
