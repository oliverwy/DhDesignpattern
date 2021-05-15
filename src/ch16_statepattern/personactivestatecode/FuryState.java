package ch16_statepattern.personactivestatecode;

public class FuryState implements AbstractState {
	@Override
	public void hitByOther(Person p) {
		// TODO Auto-generated method stub
		String string="";
		string="ANGRY_STATE还击，并骂人，继续暴怒状态，状态不变："
				+ "还是FURY_STATE";
		System.out.println(string);
	}
	@Override
	public void reciveApologyMessage(Person p) {
		// TODO Auto-generated method stub
		String string="";
		string="FURY_STATE慢慢的缓和自己的情绪，居然是只小天使误碰了一下，"
				+ "这天使怎么都神经病了！！！变成：ANGRY_STATE";
		p.setAbstractState(new AngryState());
		System.out.println(string);
	}
	@Override
	public void reciveDefyMessage(Person p) {
		// TODO Auto-generated method stub
		String string="";
		string="FURY_STATE继续暴击。。。。！，继续暴怒，状态不变";
		System.out.println(string);
	}
	@Override
	public void reciveHumorMessage(Person p) {
		// TODO Auto-generated method stub
		String string="";
		string="FURY_STATE慢慢从暴怒中恢复！。。。。，从愤怒中恢复，"
				+ "变成：ANGRY_STATE";
		p.setAbstractState(new AngryState());
		System.out.println(string);
	}

	@Override
	public void slapByOther(Person p) {
		// TODO Auto-generated method stub
		String string="";
		string="FURY_STATE猛烈还击，地狱不够你消遣的吗，撒旦，"
				+ "我必须把你抽回去，状态不变：FURY_STATE";
		System.out.println(string);
	}
}
