package ch14.NormaldelegatePattern;


public abstract class Notifier {
	private Subject subject=new Subject();

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public abstract void addMonitorInformObject(Object object,String methodName,Object[] args);
	public abstract void removeMonitorInformObject(Object object,String methodName,Object[] args);
	public abstract void notifys();
	
}
