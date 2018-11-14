package ch23commandpattern.commandpatternlightfcommand;

import java.util.ArrayList;
import java.util.List;

public abstract class Command {
	protected Appliance appliance;
	public Command(Appliance appliance)
	{
		this.appliance=appliance;
	}
	abstract public void excute();
}

interface Appliance {
	public void on();
	public void off();
}

class Light implements Appliance
{
	@Override
	public void on() {
		System.out.println("已开灯");
	}
	@Override
	public void off() {
		System.out.println("已关灯");
	}
}

class Hifi implements Appliance{
	public void on()
	{
		System.out.println("已打开音响");
	}
	public void off()
	{
		System.out.println("已关闭音响");
	}

}


class OnCommand extends Command
{
	public OnCommand(Appliance appliance) {
		super(appliance);
	}
	@Override
	public void excute() {
		appliance.on();
	}
}

class OffCommand extends Command
{
	public OffCommand(Appliance appliance) {
		super(appliance);
	}

	@Override
	public void excute() {
		appliance.off();
	}
}

class Line {
	private Command command;
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	public void notifys()
	{
		this.command.excute();
	}
}

//class Invoker
//{
//	private List<Command> commands=new ArrayList<Command>();
//	public void setCommand(Command command)
//	{
//		commands.add(command);
//	}
//	public void removeCommand(Command command)
//	{
//		commands.remove(command);
//	}
//	
//	public void notifys()
//	{
//		for (Command cmd:commands)
//		{
//			cmd.excute();
//		}
//	}
//}