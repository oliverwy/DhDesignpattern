package ch14Observerpattern.NormaldelegatePattern;

public class MonitorInform extends Notifier {

	@Override
	public void addMonitorInformObject(Object object, String methodName, Object[] args) {
		// TODO Auto-generated method stub
		this.getSubject().attach(methodName, object, args);
	}
	@Override
	public void removeMonitorInformObject(Object object, String methodName, Object[] args) {
		// TODO Auto-generated method stub
		this.getSubject().detach(methodName, object, args);
	}

	@Override
	public void notifys() {
		// TODO Auto-generated method stub
		System.out.println("你们需要的信息，通知：");
		try {
			this.getSubject().notifys();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
