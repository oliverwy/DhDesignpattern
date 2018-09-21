package ch13.buildPatternperson;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		// 创建画板
		JPanel jpanel = new JPanel() {
			// 序列号（可省略）
			private static final long serialVersionUID = 1L;

			// 重写paint方法
			@Override
			public void paint(Graphics graphics) {
				// 必须先调用父类的paint方法
				super.paint(graphics);
				BuilderThinPerson btp=new BuilderThinPerson((Graphics2D ) graphics, 2, Color.BLUE);
				PersonDirector pdthin=new PersonDirector(btp);
				pdthin.CreatePerson();
				
				BuildFatPerson bfp=new BuildFatPerson((Graphics2D ) graphics, 5, Color.RED);
				PersonDirector pdFat=new PersonDirector(bfp);
				pdFat.CreatePerson();
			}
		};
		// 将绘有小人图像的画板嵌入到相框中
		jFrame.add(jpanel);
		// 设置画框大小（宽度，高度），默认都为0
		jFrame.setSize(300, 300);
		// 将画框展示出来。true设置可见，默认为false隐藏
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
