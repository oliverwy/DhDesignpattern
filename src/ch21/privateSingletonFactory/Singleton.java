package ch21.privateSingletonFactory;

public class Singleton {

	public static Singleton getInstance() {
		return SingletonFactory.singletonInstance;
	}


	public Singleton() {
		super();
		System.out.println("创建Singleton:"+System.nanoTime());
		// TODO Auto-generated constructor stub
	}
	private static class SingletonFactory{
		private static Singleton singletonInstance=new Singleton();
	}
}
