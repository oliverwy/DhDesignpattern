package ch06_decoratorpattern.second;

public interface Finery {
    public abstract void show();
}

class Tshirts implements Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("大T恤");
    }

}

class BigTrouser implements Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("垮裤");
    }

}

class Sneakers implements Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("破球鞋");
    }

}

class Suit implements Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("西装");
    }

}

class Tie implements Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("领带");
    }

}

class LeatherShoes implements Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("皮鞋");
    }

}

class SuperManStyle implements Finery {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.printf("超人服饰");
    }

}

