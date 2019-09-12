package ch14Observerpattern.normalObserverpattern;

public class ConcreteObserver extends Observer {
    private String name;
    private String observerState;
    private Subject subject;

    public ConcreteObserver(String name, Subject subject) {
        super();
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        setObserverState(subject.getSubjectState());
        System.out.printf("\n观察者%s的新状态是%s", name, observerState);
        // TODO Auto-generated method stub

    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }
}
