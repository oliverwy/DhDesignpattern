package ch13_buildPattern.factoryPerson;

import java.awt.Color;
import java.awt.Graphics2D;

public class ThinFactory implements PersonFactory {

	@Override
	public PersonBuilder createPerson(Graphics2D g, int lineWidth, Color color) {
		// TODO Auto-generated method stub
		return new BuilderThinPerson(g, lineWidth, color);
	}

}
