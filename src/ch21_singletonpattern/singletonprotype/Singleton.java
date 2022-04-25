package ch21_singletonpattern.singletonprotype;

public class Singleton {
    private static Singleton instance;

    public Singleton() {
        super();
        System.out.println("" + "创建Singleton:" 
        + System.nanoTime());
        // TODO Auto-generated constructor stub
    }

    public static Singleton getInstance() {
        instance = new Singleton();
        return instance;
    }

    public int getInstanceID() {
        return instance.hashCode();
    }
}
