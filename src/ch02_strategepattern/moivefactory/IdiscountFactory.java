package ch02_strategepattern.moivefactory;

public interface IdiscountFactory {
    public DiscountType createDiscount();
}

class StudentDiscountFactory implements IdiscountFactory {
    @Override
    public DiscountType createDiscount() {
        return new StudentDiscount();
    }
}

class ChildrenDiscountFactory implements IdiscountFactory {
    @Override
    public DiscountType createDiscount() {
        return new ChildrenDiscount();
    }
}

class VipDiscountFactory implements IdiscountFactory {
    @Override
    public DiscountType createDiscount() {
        return new VipDiscount();
    }
}
