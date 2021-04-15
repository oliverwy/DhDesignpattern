package ch19_Compositepattern.CompositeComputerfirst;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WholePC p = new WholePC();

		BoxProtype box=new BoxProtype();
		box.setName("金河田");
		box.setPrice(260);
		p.add(box);
		
		Motherboard m = new Motherboard();
		m.setName("技嘉主板");
		m.setPrice(1000);
		p.add(m);
		
		CPU c = new CPU();
		c.setName("Intel I7-8500");
		c.setPrice(1500);
		p.add(c);
		
		Memory me = new Memory();
		me.setName("海盗船16GB");
		me.setPrice(600);
		p.add(me);
		
		HardDisk hd = new HardDisk();
		hd.setName("光威悍将1.5TB SSD ");
		hd.setPrice(648);
		p.add(hd);
		
		CDDriver cd = new CDDriver();
		cd.setName("夏新光驱");
		cd.setPrice(140);
		p.add(cd);

		DriverController dc = new DriverController();
		dc.setName("集成在主板中了");
		dc.setPrice(0);
		p.add(dc);

		Keyboard kb = new Keyboard();
		kb.setName("罗技K380");
		kb.setPrice(348);
		p.add(kb);

		DVDDevice dd = new DVDDevice();
		dd.setName("东芝DVD光驱");
		dd.setPrice(1200);
		p.add(dd);

		VideoCard vc = new VideoCard();
		vc.setName("Nidia 1080TI 11GB  ");
		vc.setPrice(8858);
		p.add(vc);

		Monitor mo = new Monitor();
		mo.setName("长城36#广角屏 ");
		mo.setPrice(1200);
		p.add(mo);

		FAN fan = new FAN();
		fan.setName("XXX 水冷  ");
		fan.setPrice(600);
		p.add(fan);

		Mouse mo1 = new Mouse();
		mo1.setName("罗技M590M ");
		mo1.setPrice(398);
		p.add(mo1);

		Power pp = new Power();
		pp.setName("长城1000W XTS ");
		pp.setPrice(800);
		p.add(pp);

		p.getChild();
		p.getPrice();

	}

}
