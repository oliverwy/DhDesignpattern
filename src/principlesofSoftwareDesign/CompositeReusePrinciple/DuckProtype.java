package principlesofSoftwareDesign.CompositeReusePrinciple;

interface Duck {
    public void quack();

    public void swim();

    public String display();

    public void fly();
}

class MallarDuck implements Duck {

    @Override
    public void quack() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String display() {
        return null;
    }

    @Override
    public void fly() {

    }
}

class RedaHeadDuck implements Duck {

    @Override
    public void quack() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String display() {
        return null;
    }

    @Override
    public void fly() {

    }
}

//惊悚了，橡皮鸭子也会飞，会叫，这不是神话剧吗？
class RubberDuck implements Duck {

    @Override
    public void quack() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String display() {
        return null;
    }

    @Override
    public void fly() {

    }
}

//这中设计肯定有问题，橡皮和木头鸭子都会飞，会叫，
// 这还怎么愉快的写代码啊？还记得接口隔离的原则没？
// 套路很简单，我们把鸭子的接口分解了，分解到一个个最小的函数功能闭包，
// 也就是这些函数组合在一起才能
class DecoyDuck implements Duck {

    @Override
    public void quack() {

    }

    @Override
    public void swim() {

    }

    @Override
    public String display() {
        return null;
    }

    @Override
    public void fly() {

    }
}


public class DuckProtype {
}
