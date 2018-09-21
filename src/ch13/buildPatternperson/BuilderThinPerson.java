package ch13.buildPatternperson;

import java.awt.Color;
import java.awt.Graphics2D;

public class BuilderThinPerson extends PersonBuilder {

	public BuilderThinPerson(Graphics2D g,int lineWidth,Color color) {
		super(g,lineWidth,color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		g.drawOval(100, 70, 30, 30);// 头部（画圆形）
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		g.drawRect(105, 100, 20, 30);// 身体（画矩形）
	}

	@Override
	public void buildArmLeft() {
		// TODO Auto-generated method stub
		g.drawLine(105, 100, 75, 120);// 左臂（画直线）
	}

	@Override
	public void buildArmRight() {
		// TODO Auto-generated method stub
		g.drawLine(125, 100, 150, 120);// 右臂（画直线）
	}

	@Override
	public void buildLegLeft() {
		// TODO Auto-generated method stub
		g.drawLine(105, 130, 75, 150);// 左腿（画直线）
	}

	@Override
	public void buildLegRight() {
		// TODO Auto-generated method stub
		g.drawLine(125, 130, 150, 150);// 右腿（画直线）
	}

}
