package ch17adapterpattern.basketballnormal;

public abstract class Player {
	protected String name;

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void attack();

	public abstract void defence();
}

class Center extends Player {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.printf("\n中锋%s进攻", getName());
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.printf("\n中锋%s防守", getName());
	}

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}

class Striker extends Player {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.printf("\n前锋%s进攻", getName());
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.printf("\n前锋%s防守", getName());
	}

	public Striker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
class Guards extends Player {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.printf("\n后卫%s进攻", getName());
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.printf("\n后卫%s防守", getName());
	}

	public Guards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}


