package ch19_Compositepattern.CompositeComputerfirst;

public class Client2 {

	public static MotherBoardPlus assembleMotherBorad(MotherBoardPlus p) {
		
		CPU c = new CPU();
		p.add(c);
		
		Memory me = new Memory();
		p.add(me);

		VideoCard vc = new VideoCard();
		p.add(vc);

		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WholePC p = new WholePC();
		MotherBoardPlus m = new MotherBoardPlus();
		m = assembleMotherBorad(m);
		p.add(m);
		HardDisk hd = new HardDisk();
		p.add(hd);
		CDDriver cd = new CDDriver();
		p.add(cd);
		DriverController dc = new DriverController();
		p.add(dc);
		Keyboard kb = new Keyboard();
		p.add(kb);

		DVDDevice dd = new DVDDevice();
		p.add(dd);
		Monitor mo = new Monitor();
		p.add(mo);

		FAN fan = new FAN();
		p.add(fan);

		Mouse mo1 = new Mouse();
		p.add(mo1);

		Power pp = new Power();

		p.add(pp);

		p.getChild();
		p.getPrice();

	}

}
