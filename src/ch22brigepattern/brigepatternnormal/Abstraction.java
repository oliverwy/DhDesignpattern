package ch22brigepattern.brigepatternnormal;

public class Abstraction {
	public Implementor getImplementor() {
		return implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}

	protected Implementor implementor;
	
	public void operation()
	{
		implementor.operation();
	}
}


class RefinedAbstraction extends Abstraction
{

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		super.operation();
	}
	
}