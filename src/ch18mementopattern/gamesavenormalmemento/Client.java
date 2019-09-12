package ch18mementopattern.gamesavenormalmemento;

public class Client {
    public static void main(String[] args) {
        // 大战Boss前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        //保存进度
        RoleStateCaretaker stateCaretaker = new RoleStateCaretaker();
        stateCaretaker.setMemento(lixiaoyao.saveState());

        //大战BOSS严重损耗
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();
        //恢复之前的进度

        lixiaoyao.recoveryState(stateCaretaker.getMemento());
        lixiaoyao.stateDisplay();
    }
}