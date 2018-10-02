package ch14Observerpattern.normalObserverpattern;

public abstract class Subject {
	
	public abstract void attach(Observer observer);
	public abstract void detach(Observer observer);
	public abstract void notifys();
	protected String SubjectState;
	public String getSubjectState() {
		return SubjectState;
	}
	public void setSubjectState(String subjectState) {
		SubjectState = subjectState;
	}
}
