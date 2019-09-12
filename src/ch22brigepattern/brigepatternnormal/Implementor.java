package ch22brigepattern.brigepatternnormal;

public interface Implementor {
    public abstract void subOperation();
}

class ConcreteImplementA implements Implementor {
    @Override
    public void subOperation() {
        System.out.println("具体实现A的方法执行");
    }
}

class ConcreteImplementB implements Implementor {
    @Override
    public void subOperation() {
        System.out.println("具体实现B的方法执行");
    }
}