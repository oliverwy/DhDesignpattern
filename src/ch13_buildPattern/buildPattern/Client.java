package ch13_buildPattern.buildPattern;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Buider b1 = new ConcreteBuilder1();
        Buider b2 = new ConcreteBuilder2();

        director.Construct(b1);
        Product p1 = b1.getResult();
        p1.show();

        director.Construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }

}
