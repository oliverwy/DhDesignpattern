package ch13.protypebuildperson;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BuildFatprottype {

	public static void main(String[] args) {
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
				graphics.setColor(Color.RED);
				Graphics2D g2=(Graphics2D )graphics;
				g2.setStroke(new BasicStroke(5.0F));
				g2.drawOval(200, 70, 30, 30);// 头部（画圆形）
				g2.drawOval(185, 100, 60, 30);// 身体（画矩形）
				g2.drawLine(205, 100, 175, 110);// 左臂（画直线）
				g2.drawLine(225, 100, 250, 110);// 右臂（画直线）
				g2.drawLine(205, 130, 175, 150);// 左腿（画直线）
				g2.drawLine(225, 130, 250, 150);// 右腿（画直线）
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
