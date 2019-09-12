package ch28visitorpattern.visitorpatternnormal;

public class ConcreteElementB extends Element {
    @Override
    public void accept(Vistor vistor) {
        // TODO Auto-generated method stub
        vistor.visitConcreteElementB(this);
    }

}
