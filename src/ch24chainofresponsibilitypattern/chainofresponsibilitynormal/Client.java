package ch24chainofresponsibilitypattern.chainofresponsibilitynormal;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Handle h1 = new ConcreteHandler1();
        Handle h2 = new ConcreteHandler2();
        Handle h3 = new ConcreteHandler3();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        int[] request = {2, 5, 14, 22, 18, 3, 27, 20};
        for (int i : request) {
            h1.handleRequest(i);
        }
    }

}
