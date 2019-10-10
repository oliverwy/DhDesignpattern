package ch13buildPattern.buildPatternComputer;

public abstract class ComputerBluePrint {
	private String Model;
	private String SN;
	private String ctype;

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getSN() {
		return SN;
	}

	public void setSN(String sN) {
		SN = sN;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}


	public abstract void CPU();

	public abstract void HardDisk();

	public abstract void Memory();

	public abstract void Monitor();

	public abstract void DriverController();

	public abstract void CDDriver();

	public abstract void VideoCard();

	public abstract void Keyboard();

	public abstract void DVDDevice();

	public abstract void FAN();

	public abstract void Mouse();

	public abstract void PowerSupply();

	public abstract void MotherBoard();
	public abstract void Box();
}
