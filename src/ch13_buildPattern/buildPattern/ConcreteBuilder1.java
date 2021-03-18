package ch13_buildPattern.buildPattern;

public class ConcreteBuilder1 extends Buider {
    private Product product;

    public ConcreteBuilder1() {
        super();
        this.product = new Product();
    }

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
