package ch28_visitorpattern.visitorpatternnormal;

public class ConreteVisitor1 extends Vistor {
    @Override
    public void visitElementTypeA(ElementTypeA concreteEelmentsA) {
        // TODO Auto-generated method stub
        System.out.printf("\n%s关注当前类型物品的名称：%s", 
        		this.getClass().getName(),
        		concreteEelmentsA.getName());
    }

    @Override
    public void visitElementTypeB(ElementTypeB concreteEelmentsB) {
        // TODO Auto-generated method stub
        System.out.printf("\n%s关注当前类型物品的名称：%s",
        		this.getClass().getName(),
        		concreteEelmentsB.getFeeName());
    }
}
