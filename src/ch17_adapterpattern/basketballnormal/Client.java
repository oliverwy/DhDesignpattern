package ch17_adapterpattern.basketballnormal;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Player b = new Striker("巴蒂尔");
        b.attack();
        Player c = new Guards("麦克格雷迪");
        c.attack();
        Player ym = new Center("姚明");
        ym.attack();
        ym.defence();
    }

}
