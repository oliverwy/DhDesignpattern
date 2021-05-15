package ch16_statepattern.personactivestatecode;

public class CalmState implements AbstractState {
	@Override
	public void hitByOther(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="CALM_STATE你为什么用东西打我！，开始情绪不稳定，"
				+ "转到情绪不稳定状态MoodilyState "
				+ "转变到MOODILY_STATE";
		p.setAbstractState(new MoodilyState());
		System.out.println(string);
	}
	@Override
	public void reciveApologyMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="CALM_STATE情绪会变好，原来是是个小天使啊，"
				+ "怎么穿着黑衣服，"
				+ "有点好玩，变成：MERRY_STATE";
		p.setAbstractState(new MerryState());
		System.out.println(string);
	}

	@Override
	public void reciveDefyMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="CALM_STATE你这个人神经病！，开始情绪不稳定。"
				+ "变成：MOODILY_STATE";
		p.setAbstractState(new MoodilyState());
		System.out.println(string);
	}
	@Override
	public void reciveHumorMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="CALM_STATE你这么逗！！！变得高兴，"
				+ "变成：MERRY_STATE";
		p.setAbstractState(new MerryState());
		System.out.println(string);
	}
	@Override
	public void slapByOther(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="CALM_STATE立马生气，开始还击，"
				+ "怎么碰到个小恶魔，开始抽他！"
				+ "变成：ANGRY_STATE";
		p.setAbstractState(new AngryState());
		System.out.println(string);
	}
}
