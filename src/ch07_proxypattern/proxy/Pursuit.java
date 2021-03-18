package ch07_proxypattern.proxy;

interface IGiveGift {
    void GiveDolls();

    void GiveFlowers();

    void GiveChocolate();
}

public class Pursuit implements IGiveGift {
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        super();
        this.mm = mm;
    }

    public void GiveDolls() {
        System.out.println(mm.getName() + " 送你洋娃娃");
    }

    public void GiveFlowers() {
        System.out.println(mm.getName() + " 送你鲜花");
    }

    public void GiveChocolate() {
        System.out.println(mm.getName() + " 送你巧克力");
    }

}

class SchoolGirl {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Proxy implements IGiveGift {
    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        super();
        gg = new Pursuit(mm);
    }

    public void GiveDolls() {
        gg.GiveDolls();
        ;
    }

    public void GiveFlowers() {
        gg.GiveFlowers();
    }

    public void GiveChocolate() {
        gg.GiveChocolate();
    }

}

