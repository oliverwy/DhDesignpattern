package ch14_Observerpattern.normalObserverpattern;

public abstract class Observable  {
    protected String State;
    public abstract void attach(Observer observer);
    public abstract void detach(Observer observer);
    public abstract void notifys();
    public String getSubjectState() {
        return State;
    }
    public void setSubjectState(String subjectState) {
        State = subjectState;
    }
}
