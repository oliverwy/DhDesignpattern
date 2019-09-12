package ch22brigepattern.brigepatternnormal;

public class Abstraction {
    protected Implementor implementor;

    //在实际的业务系统中肯定会是多个组成部分
    //作为标准示例，仅列出一个
    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.subOperation();
    }
}

class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {//完成业务逻辑肯定多个部件之间的协调，
        super.operation();//但是和组合模式之间又会有有差异，
        //这会有作为主结构类的自己的业务逻辑，而不象组合模式中仅仅负责业务逻辑的分发
        //可能具体主结构演化的不一样，这里的会有完全不同的特征出现
    }
}