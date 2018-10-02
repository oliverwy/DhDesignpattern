package ch13buildPattern.protypebuildperson;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BuildLitttlePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();// 创建画板
		JPanel jpanel = new JPanel() {
			private static final long serialVersionUID = 1L;// 序列号（可省略）
			@Override
			public void paint(Graphics graphics) {// 重写paint方法
				// 必须先调用父类的paint方法
				super.paint(graphics);// 用画笔Graphics，在画板JPanel上画一个小人
				graphics.drawOval(100, 70, 30, 30);// 头部（画圆形）
				graphics.drawRect(105, 100, 20, 30);// 身体（画矩形）
				graphics.drawLine(105, 100, 75, 120);// 左臂（画直线）
				graphics.drawLine(125, 100, 150, 120);// 右臂（画直线）
				graphics.drawLine(105, 130, 75, 150);// 左腿（画直线）
				graphics.drawLine(125, 130, 150, 150);// 右腿（画直线）
			}
		};
		jFrame.add(jpanel);// 将绘有小人图像的画板嵌入到相框中
		jFrame.setSize(300, 300);// 设置画框大小（宽度，高度），默认都为0
		jFrame.setVisible(true);// 将画框展示出来。true设置可见，默认为false隐藏
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

