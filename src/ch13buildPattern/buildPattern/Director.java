package ch13buildPattern.buildPattern;

public class Director {
	public void Construct(Buider builder)
	{
		builder.buildPartA();
		builder.buildPartB();
	}
}
