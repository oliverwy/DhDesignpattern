package ch06_decoratorpattern.first;

public class CLient {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person xc = new Person("小菜");
        System.out.println("\n第一种装扮");
        xc.WearTShirt();
        xc.WearTrousers();
        xc.WearSneaker();
        xc.show();
        System.out.println("\n第二种装扮");
        xc.WearSuit();
        xc.WearTie();
        xc.WearLeatherShoes();
        xc.show();


    }

}
