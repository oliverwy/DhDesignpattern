package ch16_statepattern.personactivestatecode;

public class AngryState implements AbstractState {
	@Override
	public void hitByOther(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="ANGRY_STATE开始还击，变成暴怒状态，变到：FURY_STATE";
		p.setAbstractState(new FuryState());
		System.out.println(string);
	}
	@Override
	public void reciveApologyMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="ANGRY_STATE缓和情绪，慢慢让自己的变得平静，呦，"
				+ "小天使啊，你这走路怎么象小恶魔，变成：MOODILY_STATE";
		p.setAbstractState(new MoodilyState());
		System.out.println(string);
	}
	@Override
	public void reciveDefyMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="ANGRY_STATE变得暴怒！开始猛烈还击！，变成暴怒，"
				+ "变成：FURY_STATE";
		p.setAbstractState(new FuryState());
		System.out.println(string);
	}
	@Override
	public void reciveHumorMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="ANGRY_STATE你就神经病！。。。。情绪慢慢消减！慢慢变得情绪不稳定，"
				+ "变成：MOODILY_STATE";
		p.setAbstractState(new MoodilyState());
		System.out.println(string);

	}
	@Override
	public void slapByOther(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="ANGRY_STATE变得暴怒！开始猛烈还击！，都是恶魔了，还不是好好滚蛋，"
				+ "我抽到你自动见你家大人去，变成：FURY_STATE";
		p.setAbstractState(new FuryState());
		System.out.println(string);

	}

}
