package ch23commandpattern.commandpatternnormal;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command c1 = new ConcreteCommand(receiver);
        Command c2 = new ConcreteCommand(receiver);
        Command c3 = new ConcreteCommand(receiver);
        Command c4 = new ConcreteCommand(receiver);
        Command c5 = new ConcreteCommand(receiver);
        Command c6 = new ConcreteCommand(receiver);
        Command c7 = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(c1);
        invoker.setCommand(c2);
        invoker.setCommand(c3);
        invoker.setCommand(c4);
        invoker.setCommand(c5);
        invoker.setCommand(c6);
        invoker.setCommand(c7);
        invoker.notifys();
    }
}
