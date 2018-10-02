package ch28.visitorpatternnormal;

public class ConcreteElementA extends Element {

	@Override
	public void accept(Vistor vistor) {
		// TODO Auto-generated method stub
		vistor.visitConcreteElementA(this);
	}

}
