package ch16_statepattern.personactivestatecode;


public class DailyLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.setAbstractState(new CalmState());
		person.hitByOther();//被小恶魔使来一下
		person.slapByOther();//撒旦来一下
		person.reciveDefyMessage();//被人无视了
		person.reciveApologyMessage();//原来是小天使。。
		person.reciveHumorMessage();//原来是是大天使。。
		person.reciveApologyMessage();
		person.reciveHumorMessage();
		
	}

}
