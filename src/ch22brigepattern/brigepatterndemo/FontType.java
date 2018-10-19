package ch22brigepattern.brigepatterndemo;

public interface FontType{
	public String setFont(String shape);
}

class SontTiType implements FontType
{
	@Override
	public String setFont(String shape) {
		// TODO Auto-generated method stub
		return "文字内容使用宋体";
	}
}

class KaiTiType implements FontType
{
	@Override
	public String setFont(String shape) {
		// TODO Auto-generated method stub
		return "文字内容使用楷体";
	}
}

class AppleTiType implements FontType
{
	@Override
	public String setFont(String shape) {
		// TODO Auto-generated method stub
		return "文字内容使用苹果体";
	}
}

class YaheiType implements FontType
{
	@Override
	public String setFont(String shape) {
		// TODO Auto-generated method stub
		return "文字内容使用雅黑体";
	}
}