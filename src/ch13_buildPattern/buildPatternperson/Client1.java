package ch13_buildPattern.buildPatternperson;

import javax.swing.*;
import java.awt.*;

public class Client1 {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();// 创建画板
        JPanel jpanel = new JPanel() {
            private static final long serialVersionUID = 1L;// 序列号（可省略）

            @Override
            public void paint(Graphics graphics) {// 重写paint方法
                super.paint(graphics);// 必须先调用父类的paint方法
                PersonBuilder btp = new BuilderThinPerson(
                        (Graphics2D) graphics, 2, Color.BLUE);
                btp.buildHead();
                btp.buildBody();
                btp.buildArmLeft();
                btp.buildArmRight();
                btp.buildLegLeft();
                btp.buildLegRight();
                PersonBuilder bfp = new BuildFatPerson(
                        (Graphics2D) graphics, 5, Color.RED);
                bfp.buildHead();
                bfp.buildBody();
                bfp.buildArmLeft();
                bfp.buildArmRight();
                bfp.buildLegLeft();
                bfp.buildLegRight();
            }
        };
        jFrame.add(jpanel);// 将绘有小人图像的画板嵌入到相框中
        jFrame.setSize(300, 300);// 设置画框大小（宽度，高度），默认都为0
        jFrame.setVisible(true);// 将画框展示出来。true设置可见，默认为false隐藏
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
