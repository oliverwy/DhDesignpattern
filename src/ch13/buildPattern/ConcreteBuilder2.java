package ch13.buildPattern;

public class ConcreteBuilder2 extends Buider {
	private Product product;
	public ConcreteBuilder2() {
		super();
		this.product=new Product();
	}
	@Override
	public void buildPartA() {
		product.add("部件X");
	}
	@Override
	public void buildPartB() {
		product.add("部件Y");
	}
	@Override
	public Product getResult() {
		return product;
	}
}
