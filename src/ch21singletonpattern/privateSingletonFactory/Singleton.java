package ch21singletonpattern.privateSingletonFactory;

public class Singleton {
    public Singleton() {
        super();
        System.out.println(""
                + "创建Singleton:" + System.nanoTime());
    }

    public static Singleton getInstance() {
        return SingletonFactory.singletonInstance;
    }

    private static class SingletonFactory {
        private static Singleton
                singletonInstance = new Singleton();
    }
}
