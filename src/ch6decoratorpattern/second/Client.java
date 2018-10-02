package ch6decoratorpattern.second;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person xc = new Person("小菜");
        System.out.printf("\n第一种装扮：");
        Finery dtx = new Tshirts();
        Finery kk = new BigTrouser();
        Finery pqx = new Sneakers();
        dtx.show();
        kk.show();
        pqx.show();
        xc.show();
        System.out.printf("\n第二种装扮：");
        Finery xz = new Suit();
        Finery ld = new Tie();
        Finery px = new LeatherShoes();
        xz.show();
        ld.show();
        px.show();
        xc.show();
        System.out.printf("\n第三种装扮: ");
        Finery cr = new SuperManStyle();
        cr.show();
        xc.show();
    }

}
