package ch14Observerpattern.normalObserverpattern;

public abstract class Subject {

    protected String SubjectState;

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void notifys();

    public String getSubjectState() {
        return SubjectState;
    }

    public void setSubjectState(String subjectState) {
        SubjectState = subjectState;
    }
}
