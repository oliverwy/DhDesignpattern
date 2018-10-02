package ch16statepattern.fourcode;

public class NoonState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<13)
		{
			System.out.printf("\n当前时间:%s点，饿了，午饭，犯困，午休",w.getHour());
		}
		else
		{
			w.setCurrent(new AfternoonState());
			w.writeProgram();
		}
	}

}
