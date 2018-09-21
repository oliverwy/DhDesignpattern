package ch13.buildPattern;

public class ConcreteBuilder2 extends Buider {
	private Product product;
	public ConcreteBuilder2() {
		super();
		this.product=new Product();
	}

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("部件X");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("部件Y");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
