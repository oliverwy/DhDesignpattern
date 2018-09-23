package ch16.fourcode;

public class SleepingState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		System.out.printf("\n当前时间:%s点不行了，睡着了",w.getHour());
	}

}
