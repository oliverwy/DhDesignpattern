package ch20_iteratorpattern.TVdemo;

import java.util.List;

public class ConcreteTv implements TvAggregate {
    private List<Chanel> Chanels; //频道
    private String tvName; //电视名称
    private String Type; //型号
    private String brand;//品牌

    public ConcreteTv(List<Chanel> chanels, String tvName,
                      String type, String brand) {
        super();
        Chanels = chanels;
        this.tvName = tvName;
        Type = type;
        this.brand = brand;
    }

    //具体电视
    public TvIterator bindIterator() {//绑定具体遥控器
        return new ConcreteTvIterator(this);
    }

    public int count() //频道数量
    {
        return Chanels.size();
    }

    public Chanel getItem(int index) //当前正在播放的频道
    {
        return Chanels.get(index);
    }

    public void insert(int index, Chanel value) //添加频道
    {
        Chanels.add(index, value);
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
