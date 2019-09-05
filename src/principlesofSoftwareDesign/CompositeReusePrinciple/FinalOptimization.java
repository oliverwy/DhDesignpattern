package principlesofSoftwareDesign.CompositeReusePrinciple;

interface Flyable {
    public void fly();
}

interface Quackable {
    public void quack();
}

class FlyWithWings implements Flyable {
    public void fly() {
        System.out.println("用翅膀飞...");
    }
}

class FlyNoWay implements Flyable {
    public void fly() {
    }
}

class Qucak implements Quackable {
    public void quack() {
        System.out.println("呱呱叫...");
    }
}

class Squeak implements Quackable {
    public void quack() {
        System.out.println("吱吱叫...");
    }
}

class MuteQuack implements Quackable {
    public void quack() {
    }
}

abstract class FDuck {
    public void swim() {
        System.out.println("鸭子游泳...");
    }

    public void display() {
        System.out.println("鸭子现身...");
    }
}

class FMallarDuck extends FDuck {
    private Flyable flyBehavior;
    private Quackable quackBehavior;

    public FMallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Qucak();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}

class FRubberDuck extends FDuck {
    private Flyable flyBehavior;
    private Quackable quackBehavior;

    public FRubberDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}

class FDecoyDuck extends FDuck {
    public FDecoyDuck() {
    }
}

public class FinalOptimization {
}
