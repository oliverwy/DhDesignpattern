package ch19_Compositepattern.CompositeComputerFinal;

public class ClientPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerCompositeParts wholePC=new ComputerCompositeParts("华为笔记本MateBook X pro",13999);
		
		ComputerCompositeParts pcBox=new ComputerCompositeParts("X Pro 专用笔记本外壳",600);
		
		ComputerCompositeParts pcMotherBoard=new ComputerCompositeParts("华为X04主板",1500);
		
		pcMotherBoard.add(new CPU("I5 8500U",1500));
		pcMotherBoard.add(new Memory("海盗船 8GB",300));
		pcMotherBoard.add(new VideoCard("Nvidia MX250",1500));
		
		pcBox.add(pcMotherBoard);
		pcBox.add(new CDDriver("东芝",0));
		pcBox.add(new DriverController("数据线集成与主板",0));
		pcBox.add(new FAN("双铜管散热",300));
		pcBox.add(new Power("64KW容量电池",1500));
		pcBox.add(new Monitor("13.3高分显示屏",1000));
		pcBox.add(new DVDDevice("东芝DVD光驱",1000));
		
		wholePC.add(pcBox);
		wholePC.add(new Mouse("蓝牙免驱双模鼠标",150));
		wholePC.getPartPrice();
		wholePC.getPartsInfo(1);
		
	}

}
