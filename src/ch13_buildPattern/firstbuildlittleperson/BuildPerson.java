package ch13_buildPattern.firstbuildlittleperson;

import java.awt.*;

class BuildPerson {
    private Graphics g;

    public BuildPerson(Graphics g) {
        super();
        this.g = g;
    }
    public void buildThin() {
        g.drawOval(100, 70, 30, 30);// 头部（画圆形）
        g.drawRect(105, 100, 20, 30);// 身体（画矩形）
        g.drawLine(105, 100, 75, 120);// 左臂（画直线）
        g.drawLine(125, 100, 150, 120);// 右臂（画直线）
        g.drawLine(105, 130, 75, 150);// 左腿（画直线）
        g.drawLine(125, 130, 150, 150);// 右腿（画直线）
    }
    public void buildFat() {
        g.setColor(Color.RED);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5.0F));
        g2.drawOval(200, 70, 30, 30);// 头部（画圆形）
        g2.drawOval(185, 100, 60, 30);// 身体（画矩形）
        g2.drawLine(205, 100, 175, 110);// 左臂（画直线）
        g2.drawLine(225, 100, 250, 110);// 右臂（画直线）
        g2.drawLine(205, 130, 175, 150);// 左腿（画直线）
        g2.drawLine(225, 130, 250, 150);// 右腿（画直线）
    }
}
