package ch20_iteratorpattern.TVdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConcreteTv implements TvAggregate {
	private List<Chanel> chanels = new ArrayList<Chanel>(); // 频道
	private String tvName; // 电视名称
	private String Type; // 型号
	private String brand;// 品牌
	private static final int pChanelCount = 255;
	private int chCount; //有效频道数
	public ConcreteTv(int chCounts, String tvName, String type, String brand) {
		super();
		if (chCounts <= pChanelCount)
			chCount = chCounts;
		else
			chCount = pChanelCount;
		this.tvName = tvName;
		Type = type;
		this.brand = brand;
	}
	public TvIterator bindIterator() {// 绑定具体遥控器
		return new ConcreteTvIterator(this);
	}
	public int count() // 频道数量
	{
		return chanels.size();
	}
	public Chanel getChanel(int index) // 当前正在播放的频道
	{
		return chanels.get(index);
	}
	@Override
	public void insertChanel(int index, Chanel value) {
		if (chanels.size() < chCount) {
			chanels.add(index, value);
		}
	}
	@Override
	public void initChanel() {
		int i;
		String chanelName;
		Random random = new Random();
		Chanel c;
		System.out.println(chCount);
		chanels.clear();
		for (i = 0; i < this.chCount; i++) {
			chanelName = "安徽" + String.valueOf(random.nextInt(this.chCount)) + "台";
			c = new Chanel(chanelName, String.valueOf(i));
			chanels.add(c);
		}
		System.out.println(chanels.size());
	}
	@Override
	public void removeChanel(int index) {
		// TODO Auto-generated method stub
		if (chanels.size() >= index)
			chanels.remove(index);

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
