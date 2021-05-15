package ch23_commandpattern.commandpatternnormal;

import java.util.ArrayList;
import java.util.List;

public abstract class Command {
    protected Receiver receiver;
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }
    abstract public void excute();
}

interface Receiver{
	public void action();
}

class ConcreteReceiver implements Receiver {
    public void action() {
        System.out.println("执行请求");
    }
}

class ConcreteCommand extends Command {
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void excute() {
        // TODO Auto-generated method stub
        receiver.action();
    }
}

class Invoker {
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void notifys() {
        for (Command cmd : commands) {
            cmd.excute();
        }
    }
}