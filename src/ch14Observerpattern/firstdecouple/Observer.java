package ch14Observerpattern.firstdecouple;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {
	protected String name;
	protected Secretary sub;

	public Observer(String name, Secretary sub) {
		super();
		this.name = name;
		this.sub = sub;
	}

	public abstract void update();

}

class NbaObserver extends Observer {
	public NbaObserver(String name, Secretary sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s关闭股票行情，继续工作\n ", sub.SecretaryAction, name);
	}
}

class StockObserver extends Observer {
	
	public StockObserver(String name, Secretary sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s关闭股票行情，继续工作\n ", sub.SecretaryAction, name);
	}
}

class Secretary {
	private List<StockObserver> observers = new ArrayList<StockObserver>();
	public String SecretaryAction;

	public void Attach(StockObserver observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer)
	{
		observers.remove(observer);
	}

	public void notifys() {
		for (StockObserver o : observers) {
			o.update();
		}
	}

	public String getSecretaryAction() {
		return SecretaryAction;
	}

	public void setSecretaryAction(String secretaryAction) {
		SecretaryAction = secretaryAction;
	}
}
