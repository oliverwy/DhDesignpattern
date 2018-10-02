package ch28.visitorpatternimplements;

import java.util.ArrayList;
import java.util.List;

public abstract class Action {
	public abstract void getManConclusion(Man concreteElemetA);
	public abstract void getWomanConclusion(Woman concreteElemetA);
}

abstract class Person
{
	public abstract void accept(Action visitor);
}

class Man extends Person
{

	@Override
	public void accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.getManConclusion(this);
	}
	
}

class Woman extends Person
{

	@Override
	public void accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.getWomanConclusion(this);
	}
	
}

class Sucess extends Action
{

	@Override
	public void getManConclusion(Man concreteElemetA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s %s 时，背后多半有个伟大的女人",concreteElemetA.getClass().getName(),this.getClass().getName());
	}

	@Override
	public void getWomanConclusion(Woman concreteElemetA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s %s 时，背后多半有个不成功的男人",concreteElemetA.getClass().getName(),this.getClass().getName());
	}
}

class Fail extends Action
{

	@Override
	public void getManConclusion(Man concreteElemetA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s %s时，闷头喝酒，谁也不用劝",concreteElemetA.getClass().getName(),this.getClass().getName());
	}

	@Override
	public void getWomanConclusion(Woman concreteElemetA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s %s时，眼泪汪汪，谁也劝不了",concreteElemetA.getClass().getName(),this.getClass().getName());
	}
}

class Amativeness extends Action
{

	@Override
	public void getManConclusion(Man concreteElemetA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s %s时，凡事不懂也要装懂",concreteElemetA.getClass().getName(),this.getClass().getName());
	}

	@Override
	public void getWomanConclusion(Woman concreteElemetA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s %s时，遇事懂也装做不懂",concreteElemetA.getClass().getName(),this.getClass().getName());
	}
}

class Marriage extends Action
{

	@Override
	public void getManConclusion(Man concreteElemetA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s %s时，感慨道：恋爱结束，幸福生活开启！",concreteElemetA.getClass().getName(),this.getClass().getName());
	}

	@Override
	public void getWomanConclusion(Woman concreteElemetA) {
		// TODO Auto-generated method stub
		System.out.printf("\n%s %s时，欣慰到：风花雪月结束，财迷油盐酱醋茶开始！",concreteElemetA.getClass().getName(),this.getClass().getName());
	}
}


class ObjectStructure
{
	private List<Person> elements= new ArrayList<Person>();
	public void attach(Person element)
	{
		elements.add(element);
	}
	
	public void detach(Person element)
	{
		elements.remove(element);
	}
	
	public void display(Action visitor)
	{
		for (Person p:elements)
		{
			p.accept(visitor);
		}
	}
}