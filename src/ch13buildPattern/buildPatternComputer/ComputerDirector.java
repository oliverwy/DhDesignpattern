package ch13buildPattern.buildPatternComputer;

public class ComputerDirector {
	private ComputerBluePrint cbp;

	public ComputerBluePrint getCbp() {
		return cbp;
	}

	public void setCbp(ComputerBluePrint cbp) {
		this.cbp = cbp;
	}
	
	public void assembleComputer()
	{
		System.out.println("开始生产"+cbp.getModel()+":"+cbp.getCtype()+"  编号为:"+cbp.getSN()+"计算机");
		cbp.Box();
		cbp.PowerSupply();
		cbp.MotherBoard();
		cbp.CPU();
		cbp.DriverController();
		cbp.Memory();
		cbp.VideoCard();
		cbp.HardDisk();
		cbp.CDDriver();
		cbp.DVDDevice();
		cbp.FAN();
		cbp.Mouse();
		cbp.Keyboard();
		cbp.Monitor();
	}
}
