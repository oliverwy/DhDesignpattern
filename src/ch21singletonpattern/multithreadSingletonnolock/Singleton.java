package ch21singletonpattern.multithreadSingletonnolock;

public class Singleton {
	private static Singleton instance=new Singleton();
	public static Singleton getInstance() {
		return instance;
	}
	public Singleton() {
		super();
		System.out.println(""
				+ "创建Singleton:"+System.nanoTime());
	}

}
