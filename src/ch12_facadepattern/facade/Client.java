package ch12_facadepattern.facade;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }

}
