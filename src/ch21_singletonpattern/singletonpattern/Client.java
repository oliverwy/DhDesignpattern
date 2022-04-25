package ch21_singletonpattern.singletonpattern;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
        Singleton s5 = Singleton.getInstance();
        Singleton s6 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("两个示例对象相同");
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
