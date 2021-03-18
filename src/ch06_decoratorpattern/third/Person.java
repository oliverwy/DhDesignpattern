package ch06_decoratorpattern.third;

public class Person {
    private String name;

    public Person() {

    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public void show() {
        System.out.printf("装饰的:%s", name);
    }
}


class Finery extends Person {
    protected Person component;

    public void Decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        if (component != null) {
            component.show();
        }
    }

}

class TShirts extends Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("大T恤");
        super.show();
    }

}

class BigTrouser extends Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("垮裤");
        super.show();
    }

}

class Sneakers extends Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("破球鞋");
        super.show();
    }

}

class Suit extends Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("西服");
        super.show();
    }

}

class Tie extends Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("领带");
        super.show();
    }

}

class LeatherShoes extends Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("皮鞋");
        super.show();
    }

}

class SupermanStyle extends Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("超人套装");
        super.show();
    }

}