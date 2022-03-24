package ch13_buildPattern.factoryPerson;

import java.awt.Color;
import java.awt.Graphics2D;

public interface PersonFactory {
	abstract PersonBuilder createPerson(Graphics2D g, int lineWidth, Color color);
}
