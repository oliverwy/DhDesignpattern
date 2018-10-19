package ch22brigepattern.brigepatterndemo;

public interface LineType {
	public String setLineType(String shape);
}

class SolidlineType implements LineType
{
	@Override
	public String setLineType(String shape) {
		// TODO Auto-generated method stub
		return "实线边界";
	}
}

class DottedlineType implements LineType
{
	@Override
	public String setLineType(String shape) {
		// TODO Auto-generated method stub
		return "虚线边界";
	}
}

class PointlineType implements LineType
{
	@Override
	public String setLineType(String shape) {
		// TODO Auto-generated method stub
		return "点线边界";
	}
}

class DashDotlineType implements LineType
{
	@Override
	public String setLineType(String shape) {
		// TODO Auto-generated method stub
		return "点画线边界";
	}
}