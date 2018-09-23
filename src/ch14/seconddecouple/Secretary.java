package ch14.seconddecouple;

import java.util.ArrayList;
import java.util.List;

public class Secretary extends Subject
{
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	void detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	void notifys() {
		// TODO Auto-generated method stub
		for(Observer o:observers)
		{
			o.update();
		}
	}
	
}

