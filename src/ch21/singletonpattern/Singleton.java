package ch21.singletonpattern;

public class Singleton {
	private static Singleton instance;

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}


	public Singleton() {
		super();
		System.out.println("创建Singleton:"+System.nanoTime());
		// TODO Auto-generated constructor stub
	}

}
