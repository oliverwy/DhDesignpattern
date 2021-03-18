package ch21_singletonpattern.multithreadSingletonnolock;

public class Singleton {
    private static Singleton instance = new Singleton();

    public Singleton() {
        super();
        System.out.println(""
                + "创建Singleton:" + System.nanoTime());
    }

    public static Singleton getInstance() {
        return instance;
    }

}
