package ch14_Observerpattern.normalObserverpattern;

public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private Observable observable;
    public ConcreteObserver(String name, Observable observable) {
        super();
        this.name = name;
        this.observable = observable;
    }
    @Override
    public void update() {
        setObserverState(observable.getSubjectState());
        System.out.printf("\n观察者%s的新状态是%s", name, observerState);
    }
    public String getObserverState() {
        return observerState;
    }
    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }
	@Override
	public void register(Observable ob) {
		ob.attach(this);
	}
	@Override
	public void unregister(Observable ob) {
		ob.detach(this);
	}
}
