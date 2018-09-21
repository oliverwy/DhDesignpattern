package ch13.buildPattern;

public class ConcreteBuilder1 extends Buider {
	private Product product;
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("部件A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("部件B");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

	public ConcreteBuilder1() {
		super();
		this.product=new Product();
	}

}
