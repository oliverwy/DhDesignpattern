package ch10_Templatepattern.TemplateMethodCode;

public abstract class AbstractClass {
    public abstract void PrimitiveOperation1();

    public abstract void PrimitiveOperation2();

    public void templateMethod() {
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("");
    }
}

class ConcreteClassA extends AbstractClass {

    @Override
    public void PrimitiveOperation1() {
        // TODO Auto-generated method stub
        System.out.println("具体类A方法1的实现");
    }

    @Override
    public void PrimitiveOperation2() {
        // TODO Auto-generated method stub
        System.out.println("具体类A方法2的实现");
    }

}

class ConcreteClassB extends AbstractClass {

    @Override
    public void PrimitiveOperation1() {
        // TODO Auto-generated method stub
        System.out.println("具体类B方法1的实现");
    }

    @Override
    public void PrimitiveOperation2() {
        // TODO Auto-generated method stub
        System.out.println("具体类B方法2的实现");

    }

}