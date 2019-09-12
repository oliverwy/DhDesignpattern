package ch17adapterpattern.firstcode;

//目标接口，或称为标准接口
interface Target {
    public void request();
}

class ConcreteTarget implements Target {
    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
}

class Adaptee {
    public void specialRequest() {
        System.out.println("特殊请求");
    }
}

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specialRequest();
    }

}
