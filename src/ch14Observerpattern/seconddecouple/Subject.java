package ch14Observerpattern.seconddecouple;

public abstract class Subject {
    String SubjectState;

    abstract void attach(Observer observer);

    abstract void detach(Observer observer);

    abstract void notifys();

    public String getSubjectState() {
        return SubjectState;
    }

    public void setSubjectState(String subjectState) {
        SubjectState = subjectState;
    }

}

