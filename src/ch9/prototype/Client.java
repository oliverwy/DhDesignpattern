package ch9.prototype;

public class Client {
    ConcretePrototype p1 = new ConcretePrototype("I");
    ConcretePrototype c1 = (ConcretePrototype) p1.Clone();
	System.out.println();
}
