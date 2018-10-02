package ch16statepattern.fourcode;

public class AfternoonState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<18)
		{
			System.out.printf("\n当前时间:%s点，下午状态不错，继续努力",w.getHour());
		}
		else
		{
			w.setCurrent(new EveningState());
			w.writeProgram();
		}
	}

}
