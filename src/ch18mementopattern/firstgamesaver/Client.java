package ch18mementopattern.firstgamesaver;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameRole lixiaoyao=new GameRole();
		lixiaoyao.getInitState();
		lixiaoyao.stateDisplay();
		
		GameRole backup=new GameRole();
		backup.setVit(lixiaoyao.getVit());
		backup.setAtk(lixiaoyao.getAtk());
		backup.setDef(lixiaoyao.getDef());
		
		lixiaoyao.fight();
		
		lixiaoyao.stateDisplay();
		
		lixiaoyao.setAtk(backup.getAtk());
		lixiaoyao.setDef(backup.getDef());
		lixiaoyao.setVit(backup.getVit());
		
		lixiaoyao.stateDisplay();
	}

}
