package ch26flyweightpattern.flyweightnormal;

import java.util.Hashtable;

public abstract class Flyweight {
	public abstract void opration(int extrinsicstates);
}

class ConcreteFlyweight extends Flyweight
{

	@Override
	public void opration(int extrinsicstates) {
		// TODO Auto-generated method stub
		System.out.println("具体Flyweight:"+extrinsicstates);
	}
	
}

class UnshareConcreteFlyweight extends Flyweight
{

	@Override
	public void opration(int extrinsicstates) {
		// TODO Auto-generated method stub
		System.out.println("不共享的具体Flyweight:"+extrinsicstates);
	}
	
}

class FlyweightFactory
{
	private Hashtable<String, Flyweight> flyweight=new Hashtable<>();

	public FlyweightFactory() {
		super();
		flyweight.put("X",new ConcreteFlyweight());
		flyweight.put("Y",new ConcreteFlyweight());
		flyweight.put("Z",new ConcreteFlyweight());
		flyweight.put("U",new ConcreteFlyweight());
		
		// TODO Auto-generated constructor stub
	}
	
	public Flyweight getFlyweight(String key)
	{
		return (Flyweight) flyweight.get(key);
	}
	
	
}