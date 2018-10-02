package ch14Observerpattern.seconddecouple;

public class NbaObserver extends Observer {
	public NbaObserver(String name, Subject sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s关闭NBA直播，继续工作\n ", sub.getSubjectState(), name);
	}
}