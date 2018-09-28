package ch19.CompositecompanyMis;

public abstract class Company {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String name;

	public Company(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(Company c);
	public abstract void remove(Company c);
	public abstract void display(int depth);
	public abstract void lineOfDuty();

}
