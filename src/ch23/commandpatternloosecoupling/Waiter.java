package ch23.commandpatternloosecoupling;

public class Waiter {
	private Command command;
	public void setOrder(Command command)
	{
		this.command=command;
	}
	
	public void notifys()
	{
		command.excuteCommand();
	}
}
