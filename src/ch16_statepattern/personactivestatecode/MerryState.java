package ch16_statepattern.personactivestatecode;

public class MerryState implements AbstractState {
	@Override
	public void hitByOther(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="MERRY_STATE莫名的疑惑！平静的判断情况，咦，"
				+ "来了一只小恶魔"
				+ "，我看看他干啥！变成：CALM_STATE";
		p.setAbstractState(new CalmState());
		System.out.println(string);
	}
	@Override
	public void reciveApologyMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="MERRY_STATE没事，没事，保持状态不变，"
				+ "还是天使守规矩啊！"
				+ "状态不变：MERRY_STATE";
		System.out.println(string);
	}
	@Override
	public void reciveDefyMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="MERRY_STATE为什么打我！！，你们什么时候出来的，"
				+ "撒旦你带着儿子人多就了不起啊 "
				+ "变成：CALM_STATE";
		p.setAbstractState(new CalmState());
		System.out.println(string);
	}
	@Override
	public void reciveHumorMessage(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="当前状态：MERRY_STATE,大王教你来巡山的，"
				+ "你就这样祸乱人间。。。"
				+ "哈哈，变成：MERRY_STATE";
		System.out.println(string);
	}
	@Override
	public void slapByOther(Person p) {
		// TODO Auto-generated method stub
		String string;
		string="MERRY_STATE为什么打我！！恶魔？天使？"
				+ "变成：MOODILY_STATE";
		p.setAbstractState(new MoodilyState());
		System.out.println(string);
	}
}
