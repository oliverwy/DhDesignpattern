package ch16statepattern.fourcode;

public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		// TODO Auto-generated method stub
		if(w.getHour()<12)
		{
			System.out.printf("\n当前时间:%s点，上午工作，精神百倍",w.getHour());
		}
		else {
			w.setCurrent(new NoonState());
			w.writeProgram();
		}
	}

}
