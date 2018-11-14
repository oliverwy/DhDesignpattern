package ch28visitorpattern.visitorpatternnormal;

public class ConreteVisitor1 extends Vistor {
	@Override
	public void visitConcreteElementA(Element concreteEelmentsA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s 被 %s 访问！",concreteEelmentsA.getClass().getName(),this.getClass().getName());
	}
	@Override
	public void visitConcreteElementB(Element concreteEelmentsB) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s 被 %s 访问！",concreteEelmentsB.getClass().getName(),this.getClass().getName());
	}
}
