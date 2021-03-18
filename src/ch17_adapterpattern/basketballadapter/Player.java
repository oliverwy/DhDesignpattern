package ch17_adapterpattern.basketballadapter;

public abstract class Player {
    protected String name;

    public Player(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defence();
}

class Center extends Player {

    public Center(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.printf("\n中锋%s进攻", getName());
    }

    @Override
    public void defence() {
        // TODO Auto-generated method stub
        System.out.printf("\n中锋%s防守", getName());
    }

}

class Striker extends Player {

    public Striker(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.printf("\n前锋%s进攻", getName());
    }

    @Override
    public void defence() {
        // TODO Auto-generated method stub
        System.out.printf("\n前锋%s防守", getName());
    }

}

class Guards extends Player {

    public Guards(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.printf("\n后卫%s进攻", getName());
    }

    @Override
    public void defence() {
        // TODO Auto-generated method stub
        System.out.printf("\n后卫%s防守", getName());
    }

}


