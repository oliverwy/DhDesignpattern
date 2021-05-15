package ch16_statepattern.personactivestatecode;

public class MoodilyState implements AbstractState {
	@Override
	public void hitByOther(Person p) {
		// TODO Auto-generated method stub
		String string;
		string = "MOODILY_STATE容易生气！，开始超生气状态转变，"
				+ "变成：ANGRY_STATE";
		p.setAbstractState(new AngryState());
		System.out.println(string);
	}
	@Override
	public void reciveApologyMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string = "MOODILY_STATE心情变好，开始平和！，"
				+ "原来是小天使啊碰到我了，没事，变成：CALM_STATE";
		p.setAbstractState(new CalmState());
		System.out.println(string);
	}
	@Override
	public void reciveDefyMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string = "MOODILY_STATE容易生气！，开始超生气状态转变，"
				+ "变成：ANGRY_STATE";
		p.setAbstractState(new AngryState());
		System.out.println(string);
	}
	@Override
	public void reciveHumorMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string = "当前状态：MOODILY_STATE 这是哪个大王请来逗比表演的!"
				+ "不和你一般见识：变成：CALM_STATE";
		p.setAbstractState(new CalmState());
		System.out.println(string);
	}

	@Override
	public void slapByOther(Person p) {
		// TODO Auto-generated method stub
		String string;
		string = "MOODILY_STATE开始猛烈还击！，怎么碰到这类鸟人，"
				+ "抽他，扁他，"
				+ "变成：FURY_STATE";
		p.setAbstractState(new FuryState());
		System.out.println(string);
	}
}
