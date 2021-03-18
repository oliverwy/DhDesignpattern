package ch06_decoratorpattern.third;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person xc = new Person("小菜");

        System.out.printf("第一种装扮：");
        Sneakers pqx = new Sneakers();
        BigTrouser kk = new BigTrouser();
        TShirts dtx = new TShirts();
        pqx.Decorate(xc);
        kk.Decorate(pqx);
        dtx.Decorate(kk);
        dtx.show();

        System.out.printf("\n第二种装扮：");
        LeatherShoes px = new LeatherShoes();
        Tie ldTie = new Tie();
        Suit xzSuit = new Suit();
        px.Decorate(xc);
        ldTie.Decorate(px);
        xzSuit.Decorate(ldTie);
        xzSuit.show();

        System.out.printf("\n第三种装扮: ");
        SupermanStyle supermanStyle = new SupermanStyle();
        supermanStyle.Decorate(xc);
        supermanStyle.show();
    }

}
