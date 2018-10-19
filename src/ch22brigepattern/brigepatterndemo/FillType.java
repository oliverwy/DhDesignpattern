package ch22brigepattern.brigepatterndemo;

public interface FillType{
	public String fillShape(String filltype);
}

class GridFill implements FillType{
	@Override
	public String fillShape(String filltype) {
		// TODO Auto-generated method stub
		return "网格线填充";
	}
	
}

class LeftSlantlineFill implements FillType{
	@Override
	public String fillShape(String filltype) {
		// TODO Auto-generated method stub
		return "左斜线填充";
	}
}

class RightSlantlineFill implements FillType{
	@Override
	public String fillShape(String filltype) {
		// TODO Auto-generated method stub
		return "右斜线填充";
	}
}

class HorizontalSlantlineFill implements FillType{
	@Override
	public String fillShape(String filltype) {
		// TODO Auto-generated method stub
		return "水平线填充";
	}
}