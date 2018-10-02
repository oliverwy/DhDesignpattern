package ch14Observerpattern.seconddecouple;

public abstract class Subject {
	abstract void attach(Observer observer);
	abstract void detach(Observer observer);
	abstract void notifys();
	String SubjectState;
	public String getSubjectState() {
		return SubjectState;
	}
	public void setSubjectState(String subjectState) {
		SubjectState = subjectState;
	}
	
}

