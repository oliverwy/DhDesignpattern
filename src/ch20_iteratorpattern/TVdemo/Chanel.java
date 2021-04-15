package ch20_iteratorpattern.TVdemo;

public class Chanel { // 每一个频道的属性
    private String name;
    private String chanalNo;

    public Chanel(String name, String chanalNo) {
        super();
        this.name = name;
        this.chanalNo = chanalNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChanalNo() {
        return chanalNo;
    }

    public void setChanalNo(String chanalNo) {
        this.chanalNo = chanalNo;
    }

    public String play() {
        return "频道：" + getChanalNo() + "：" + getName() + "正在播放节目";
    }
}
