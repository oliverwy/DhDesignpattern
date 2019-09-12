package ch18mementopattern.firstgamesaver;

public class GameRole {
    // 生命力
    private int vit;
    // 攻击力
    private int atk;
    // 防御力
    private int Def;

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return Def;
    }

    public void setDef(int def) {
        Def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.printf("\n体力：%s", getVit());
        System.out.printf("\n攻击力：%s", getAtk());
        System.out.printf("\n防御力：%s", getDef());
        System.out.println("");
    }

    //获得初试状态
    public void getInitState() {
        setVit(100);
        setAtk(100);
        setDef(100);
    }

    //战斗，与Boss大战后游戏数据损耗为零
    public void fight() {
        setVit(0);
        setAtk(0);
        setDef(0);
    }
}
