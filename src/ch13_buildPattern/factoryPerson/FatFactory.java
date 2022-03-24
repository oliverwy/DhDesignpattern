package ch13_buildPattern.factoryPerson;

import java.awt.Color;
import java.awt.Graphics2D;

public class FatFactory implements PersonFactory {

	@Override
	public PersonBuilder createPerson(Graphics2D g, int lineWidth, Color color) {
		// TODO Auto-generated method stub
		return new BuildFatPerson(g, lineWidth, color);
	}

}
