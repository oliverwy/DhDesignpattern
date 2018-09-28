package ch13.buildPatternperson;
import java.awt.Color;
import java.awt.Graphics2D;
public class BuildFatPerson extends PersonBuilder {
	public BuildFatPerson(Graphics2D g, int lineWidth, Color color) {
		super(g, lineWidth, color);
	}
	@Override
	public void buildHead() {
		g.drawOval(200, 70, 30, 30);// 头部（画圆形）
	}
	@Override
	public void buildBody() {
		g.drawOval(185, 100, 60, 30);// 身体（画矩形）
	}
	@Override
	public void buildArmLeft() {
		g.drawLine(205, 100, 175, 110);// 左臂（画直线）
	}
	@Override
	public void buildArmRight() {
		g.drawLine(225, 100, 250, 110);// 右臂（画直线）
	}
	@Override
	public void buildLegLeft() {
		g.drawLine(205, 130, 175, 150);// 左腿（画直线）
	}
	@Override
	public void buildLegRight() {
		g.drawLine(225, 130, 250, 150);// 右腿（画直线）
	}
}
