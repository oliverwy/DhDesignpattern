package ch2.Strategy;

public class ClientStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context;
		context=new Context(new ConcreteStrategyA());
		context.ContextInterface();
		context=new Context(new ConcreteStrategyB());
		context.ContextInterface();
		context=new Context(new ConcreteStrategyC());
		context.ContextInterface();
	}

}
