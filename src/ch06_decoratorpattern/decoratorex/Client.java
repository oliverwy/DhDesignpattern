package ch06_decoratorpattern.decoratorex;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.Operation();

    }

}
