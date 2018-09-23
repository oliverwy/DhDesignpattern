package ch16.fourcode;

public class RestState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.printf("\n当前时间:%s点下班回家了",w.getHour());
	}

}
