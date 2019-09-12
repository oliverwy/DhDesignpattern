package ch23commandpattern.loosecouplingafter;


public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChichenWingCommand2 = new BakeChickenWing(boy);
        Waiter girl = new Waiter();

        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChichenWingCommand2);
        girl.setOrder(bakeMuttonCommand1);

        girl.notifys();
    }

}
