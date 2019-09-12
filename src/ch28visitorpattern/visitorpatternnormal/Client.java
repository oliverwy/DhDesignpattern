package ch28visitorpattern.visitorpatternnormal;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        Vistor v1 = new ConreteVisitor1();
        Vistor v2 = new ConreteVisitor2();

        o.display(v1);
        o.display(v2);
    }
}
