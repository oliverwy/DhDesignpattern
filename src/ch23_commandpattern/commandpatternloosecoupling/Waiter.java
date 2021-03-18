package ch23_commandpattern.commandpatternloosecoupling;

public class Waiter {
    private Command command;

    public void setOrder(Command command) {
        this.command = command;
    }

    public void notifys() {
        command.excuteCommand();
    }
}
