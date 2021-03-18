package ch08_factorypattern.Leifengfactory;

public class XueLeiFeng {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LeiFeng xueleifeng = new Undergraduate();
        xueleifeng.BuyRice();
        xueleifeng.Sweep();
        xueleifeng.Wash();
    }

}
