package ch6;

public class Person {
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Person(String name) {
		super();
		Name = name;
	}
	
	public void WearTShirt() {
		System.out.println("大T恤");
	}

}
