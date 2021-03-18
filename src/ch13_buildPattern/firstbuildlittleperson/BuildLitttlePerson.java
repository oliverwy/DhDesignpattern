package ch13_buildPattern.firstbuildlittleperson;

import javax.swing.*;
import java.awt.*;

public class BuildLitttlePerson {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jpanel = new JPanel() {// 创建画板
            private static final long serialVersionUID = 1L;// 序列号（可省略）

            @Override
            public void paint(Graphics graphics) {// 重写paint方法
                super.paint(graphics);// 必须先调用父类的paint方法
                BuildFatPerson pg = new BuildFatPerson(graphics);
                pg.buildThin();
                pg.buildFat();
            }
        };
        jFrame.add(jpanel);// 将绘有小人图像的画板嵌入到相框中
        jFrame.setSize(300, 300);// 设置画框大小（宽度，高度），默认都为0
        jFrame.setVisible(true);// 将画框展示出来。true设置可见，默认为false隐藏
    }

}

