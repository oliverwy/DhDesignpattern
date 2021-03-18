package ch23_commandpattern.commandpatternloosecoupling;

public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public Barbecuer getReceiver() {
        return receiver;
    }

    public void setReceiver(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void excuteCommand();
}


class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void excuteCommand() {
        // TODO Auto-generated method stub
        receiver.bakeMutton();
    }

}

class BakeChickenWing extends Command {

    public BakeChickenWing(Barbecuer receiver) {
        super(receiver);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void excuteCommand() {
        // TODO Auto-generated method stub
        receiver.bakeChickenWing();
    }

}