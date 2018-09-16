package ch7.onlyproxy;


public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");
        Proxy daili = new Proxy(jiaojiao);

        daili.GiveDolls();
        daili.GiveFlowers();
        daili.GiveChocolate();

    }

}
