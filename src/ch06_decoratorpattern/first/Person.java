package ch06_decoratorpattern.first;

public class Person {
    private String Name;

    public Person(String name) {
        super();
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void WearTShirt() {
        System.out.print("大T恤 ");
    }

    public void WearTrousers() {
        System.out.printf("垮裤 ");
    }

    public void WearSneaker() {
        System.out.printf("破球鞋 ");
    }

    public void WearSuit() {
        System.out.printf("西装 ");
    }

    public void WearTie() {
        System.out.printf("领带 ");
    }

    public void WearLeatherShoes() {
        System.out.printf("皮鞋 ");
    }

    public void show() {
        System.out.printf("装扮的%s", Name);
        System.out.println();
    }

}
