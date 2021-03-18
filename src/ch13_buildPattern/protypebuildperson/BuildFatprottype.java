package ch13_buildPattern.protypebuildperson;

import javax.swing.*;
import java.awt.*;

public class BuildFatprottype {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jpanel = new JPanel() {// 创建画板
            private static final long serialVersionUID = 1L;// 序列号（可省略）

            @Override
            public void paint(Graphics graphics) {// 重写paint方法
                // 必须先调用父类的paint方法
                super.paint(graphics);
                graphics.setColor(Color.RED);
                Graphics2D g2 = (Graphics2D) graphics;
                g2.setStroke(new BasicStroke(5.0F));
                g2.drawOval(200, 70, 30, 30);// 头部（画圆形）
                //g2.drawOval(185, 100, 60, 30);// 身体（画矩形）
                g2.drawLine(205, 100, 175, 110);// 左臂（画直线）
                g2.drawLine(225, 100, 250, 110);// 右臂（画直线）
                g2.drawLine(205, 130, 175, 150);// 左腿（画直线）
                g2.drawLine(225, 130, 250, 150);// 右腿（画直线）
            }
        };
        jFrame.add(jpanel);        // 将绘有小人图像的画板嵌入到相框中
        jFrame.setSize(300, 300);        // 设置画框大小（宽度，高度），默认都为0
        jFrame.setVisible(true);// 将画框展示出来。true设置可见，默认为false隐藏
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
