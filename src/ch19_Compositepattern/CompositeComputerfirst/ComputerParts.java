package ch19_Compositepattern.CompositeComputerfirst;

import java.util.ArrayList;
import java.util.List;

abstract public class ComputerParts {
	private String name;
	private float unitprice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(float price) {
		this.unitprice = price;
	}
	public float getUnitprice()
	{
		return this.unitprice;
	}
	
	public abstract float getPrice();
}

class CPU extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"CPU的价格："+getUnitprice());
		return getUnitprice();
	}

}

class HardDisk extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"--硬盘的价格："+getUnitprice());
		return getUnitprice();
	}

}

class Memory extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"--内存的价格："+getUnitprice());
		return getUnitprice();
	}

}

class DriverController extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"--硬盘控制器的价格："+getUnitprice());
		return getUnitprice();
	}

}

class CDDriver extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"--光驱的价格："+getUnitprice());
		return getUnitprice();
	}

}

class Keyboard extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"--键盘的价格："+getUnitprice());
		return getUnitprice();
	}

}

class DVDDevice extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"--DVD的价格："+getUnitprice());
		return getUnitprice();
	}

}

class VideoCard extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"--显卡的价格："+getUnitprice());
		return getUnitprice();
	}

}

class Monitor extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"--显示的价格："+getUnitprice());
		return getUnitprice();
	}

}

class FAN extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"风扇的价格："+getUnitprice());
		return getUnitprice();
	}

}

class Mouse extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"--鼠标的价格："+getUnitprice());
		return getUnitprice();
	}

}

class Power extends ComputerParts {

	@Override
	public float getPrice() {
		System.out.println(getName()+"--电源的价格："+getUnitprice());
		return getUnitprice();
	}

}

class Composite extends ComputerParts {
	private List<ComputerParts> a = new ArrayList<ComputerParts>();

	@Override
	public float getPrice() {
		float p = 0;
		for (int i = 0; i < a.size(); i++) {
			p = p + a.get(i).getPrice();
		}
		System.out.println(p);
		return p;
	}

	public void add(ComputerParts c) {
		a.add(c);
	}

	public void remove(ComputerParts c) {
		a.remove(c);
	}

	public void getChild() {
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).toString());
		}
	}
}

class MotherBoardPlus extends Composite {

	@Override
	public float getPrice() {
		System.out.println(getName()+"的价格为："+getUnitprice());
		return super.getPrice()+getUnitprice();
	}
}

class Box extends Composite{
	public float getPrice() {
		System.out.println(getName()+"的价格为："+getUnitprice());
		return super.getPrice()+getUnitprice();
	}
}

class WholePC extends Composite {
	public void calculateProcess() {
		System.out.println("计算机组装起来后可以完成一定的计算！");
	}
}
