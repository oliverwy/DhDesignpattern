package ch13buildPattern.buildPatternperson;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

abstract class PersonBuilder {
	protected Graphics2D g;
	protected int lineWidth;
	protected Color color;

	public PersonBuilder(Graphics2D g,int lineWidth,Color color) {
		super();
		this.g = g;
		this.lineWidth=lineWidth;
		this.color=color;
		g.setStroke(new BasicStroke(lineWidth));
		g.setColor(color);
	}
	public abstract void buildHead();
	public abstract void buildBody();
	public abstract void buildArmLeft();
	public abstract void buildArmRight();
	public abstract void buildLegLeft();
	public abstract void buildLegRight();
	public abstract void buildTail();
}


