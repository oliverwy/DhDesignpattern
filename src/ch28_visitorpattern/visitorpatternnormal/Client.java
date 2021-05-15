package ch28_visitorpattern.visitorpatternnormal;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ObjectStructure o = new ObjectStructure();
        o.attach(new ElementTypeA("棉签数量",10));
        o.attach(new ElementTypeB("当归",10.5));

        Vistor v1 = new ConreteVisitor1();
        Vistor v2 = new ConreteVisitor2();

        o.display(v1);
        o.display(v2);
    }
}
