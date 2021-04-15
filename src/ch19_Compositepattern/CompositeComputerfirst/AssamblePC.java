package ch19_Compositepattern.CompositeComputerfirst;

public class AssamblePC {
	public static void main(String[] args) {
		Composite m=new MotherBoardPlus();
		m.setName("技嘉主板");
		m.setPrice(1500); //打开主板，
		
		ComputerParts c = new CPU();
		c.setName("Intel I7-8500");
		c.setPrice(1500);
		m.add(c); //安装CPU
		
		ComputerParts me = new Memory();
		me.setName("海盗船16GB");
		me.setPrice(600);
		m.add(me); //安装内存
		
		ComputerParts vc = new VideoCard();
		vc.setName("Nidia 1080TI 11GB  ");
		vc.setPrice(8858);
		m.add(vc); //安装显卡

		Composite box=new Box();
		box.setName("金河田");
		box.setPrice(260); //拿来机箱

		ComputerParts pp = new Power();
		pp.setName("长城1000W XTS ");
		pp.setPrice(800); //拿来电源
		box.add(pp); //安装电源
		box.add(m); //安装主板

		ComputerParts dd = new DVDDevice();
		dd.setName("东芝DVD光驱");
		dd.setPrice(1200);
		box.add(dd);  //安装DVD光驱
		
		ComputerParts fan = new FAN();
		fan.setName("XXX 水冷  ");
		fan.setPrice(600);
		box.add(fan); //安装风扇
		
		ComputerParts cd = new CDDriver();
		cd.setName("夏新光驱");
		cd.setPrice(140);
		box.add(cd); //安装CD光驱
		
		Composite wholepc=new WholePC();
		wholepc.setName("组装机");
		wholepc.setPrice(0);  // 成套系统
		
		wholepc.add(box);  // 机箱成品放进来
		
		ComputerParts mo = new Monitor();
		mo.setName("长城36#广角屏 ");
		mo.setPrice(1200);
		wholepc.add(mo);  //配好显示器
		
		ComputerParts kb = new Keyboard();
		kb.setName("罗技K380");
		kb.setPrice(348);
		wholepc.add(kb); //配好键盘

		ComputerParts mo1 = new Mouse();
		mo1.setName("罗技M590M ");
		mo1.setPrice(398);
		wholepc.add(mo1); //配好鼠标
		
		wholepc.getChild();
		System.out.println(wholepc.getPrice());
		
	}

}
