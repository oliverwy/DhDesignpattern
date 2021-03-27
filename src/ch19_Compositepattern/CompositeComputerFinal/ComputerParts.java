package ch19_Compositepattern.CompositeComputerFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ComputerParts {
	protected String name;
	protected float price;

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public ComputerParts(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void add(ComputerParts c);
	public abstract void remove(ComputerParts c);
	public abstract void getPartsInfo(int depth);
	public abstract float getPartPrice();
}

class CPU extends ComputerParts {

	public CPU(String name, float price) {
		super(name, price);
	}

	@Override
	public void add(ComputerParts c) {
	}

	@Override
	public void remove(ComputerParts c) {
	}

	@Override
	public void getPartsInfo(int depth) {
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		System.out.printf("\nCPU的价格是：%f", getPrice());
		return getPrice();
	}
}

class HardDisk extends ComputerParts {
	public HardDisk(String name, float price) {
		super(name, price);
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\n硬盘的价格是：%f", getPrice());
		return getPrice();
	}
}

class Memory extends ComputerParts {

	public Memory(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\n内存的价格是：%f", getPrice());
		return getPrice();
	}
}

class DriverController extends ComputerParts {

	public DriverController(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\n数据线的价格是：%f", getPrice());
		return getPrice();
	}
}

class CDDriver extends ComputerParts {

	public CDDriver(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\nCDDriver的价格是：%f", getPrice());
		return getPrice();
	}
}

class Keyboard extends ComputerParts {

	public Keyboard(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\n键盘的价格是：%f", getPrice());
		return getPrice();
	}
}

class DVDDevice extends ComputerParts {

	public DVDDevice(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\nDVD的价格是：%f", getPrice());
		return getPrice();
	}
}

class VideoCard extends ComputerParts {

	public VideoCard(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\n显卡的价格是：%f", getPrice());
		return getPrice();
	}
}

class Monitor extends ComputerParts {

	public Monitor(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\n显示屏的价格是：%f", getPrice());
		return getPrice();
	}
}

class FAN extends ComputerParts {

	public FAN(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\n风扇的价格是：%f", getPrice());
		return getPrice();
	}
}

class Mouse extends ComputerParts {

	public Mouse(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\n鼠标的价格是：%f\n", getPrice());
		return getPrice();
	}
}

class Power extends ComputerParts {

	public Power(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName());
	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.printf("\n电源或者电池的价格是：%f/n", getPrice());
		return getPrice();
	}
}

class ComputerCompositeParts extends ComputerParts {

	private List<ComputerParts> children = new ArrayList<ComputerParts>();

	public ComputerCompositeParts(String name, float price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(ComputerParts c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(ComputerParts c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void getPartsInfo(int depth) {
		// TODO Auto-generated method stub
		System.out.printf("\n" + String.join("", Collections.nCopies(depth, "-")) + getName()+":"+getPrice());
		for (int i = 0; i < children.size(); i++) {
			children.get(i).getPartsInfo(depth + 2);
		}

	}

	@Override
	public float getPartPrice() {
		// TODO Auto-generated method stub
		System.out.print("\n"+getName()+":"+getPrice());
		for (int i = 0; i < children.size(); i++) {
			children.get(i).getPartPrice();
		}
		return getPrice();
	}
}