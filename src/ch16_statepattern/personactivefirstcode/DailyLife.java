package ch16_statepattern.personactivefirstcode;

public class DailyLife {

	public static void main(String[] args) {
		// 生活就是一场闹剧，你都不知道什么会天使和恶魔一起调戏。
		Person person=new Person();//你莫名其妙的穿越到一个欢乐的海洋
		person.setState(Person.MERRY_STATE);
		person.hitByOther();//被小恶魔使来一下
		person.slapByOther();//撒旦来一下
		person.reciveDefyMessage();//被人无视了
		person.reciveApologyMessage();//原来是小天使。。
		person.reciveHumorMessage();//原来是是大天使。。
		person.reciveApologyMessage();
		person.reciveHumorMessage();

	}

}
