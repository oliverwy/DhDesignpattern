package ch12_facadepattern.facade;

public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        super();
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("\n方法组A-----子系统的组合或者功能组合");
        one.method1();
        three.method3();
        two.method2();
    }

    public void methodB() {
        System.out.println("\nz方法B------子系统组合或者功能组合");
        four.method4();
        three.method3();

    }

}

class SubSystemOne {
    public void method1() {
        System.out.println("子系统方法一");
    }
}

class SubSystemTwo {
    public void method2() {
        System.out.println("子系统方法2");
    }
}

class SubSystemThree {
    public void method3() {
        System.out.println("子系统方法3");
    }
}

class SubSystemFour {
    public void method4() {
        System.out.println("子系统方法4");
    }
}