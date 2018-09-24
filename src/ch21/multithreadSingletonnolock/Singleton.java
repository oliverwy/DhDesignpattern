package ch21.multithreadSingletonnolock;

public class Singleton {
	private static Singleton instance=new Singleton();
	public static Singleton getInstance() {
		return instance;
	}

	public Singleton() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("创建Singleton:"+System.nanoTime());
	}

}
