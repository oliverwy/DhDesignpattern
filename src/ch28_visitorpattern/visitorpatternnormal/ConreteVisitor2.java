package ch28_visitorpattern.visitorpatternnormal;

public class ConreteVisitor2 extends Vistor {
	public void visitElementTypeA(ElementTypeA concreteEelmentsA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s关注当前类型物品的名称：%s,还关心数量： %d", 
				this.getClass().getName(), 
				concreteEelmentsA.getName(),
				concreteEelmentsA.getCount());
	}

	@Override
	public void visitElementTypeB(ElementTypeB concreteEelmentsB) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s关注当前类型物品的名称：%s,还关心价格： %f", 
				this.getClass().getName(), 
				concreteEelmentsB.getFeeName(),
				concreteEelmentsB.getFeeCount());
	}
}
