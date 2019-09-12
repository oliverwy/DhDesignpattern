package ch23commandpattern.commandpatternloosecoupling;

public class Client {
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChichenWingCommand2 = new BakeChickenWing(boy);

        Waiter girl = new Waiter();
        girl.setOrder(bakeMuttonCommand1);
        girl.notifys();
        girl.setOrder(bakeMuttonCommand2);
        girl.notifys();
        girl.setOrder(bakeChichenWingCommand2);
        girl.notifys();
    }
}
