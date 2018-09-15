package ch2.Strategy;

public interface Strategy {
	public abstract void AlgorithnInterface();
}

class ConcreteStrategyA implements Strategy{

	@Override
	public void AlgorithnInterface() {
		// TODO Auto-generated method stub
		System.out.println("算法A的实现");
		
	}
	
}
class ConcreteStrategyB implements Strategy{

	@Override
	public void AlgorithnInterface() {
		// TODO Auto-generated method stub
		System.out.println("算法B的实现");
		
	}
	
}
class ConcreteStrategyC implements Strategy{

	@Override
	public void AlgorithnInterface() {
		// TODO Auto-generated method stub
		System.out.println("算法C的实现");
		
	}
	
}

class Context{
	Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void ContextInterface() {
		strategy.AlgorithnInterface();
	}
}

