package ch22brigepattern.brigepatternnormal;

public abstract class Implementor {
	public abstract void operation();
}

class ConcreteImplementA extends Implementor
{

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("具体实现A的方法执行");
	}
	
}

class ConcreteImplementB extends Implementor
{

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("具体实现B的方法执行");

	}
	
}