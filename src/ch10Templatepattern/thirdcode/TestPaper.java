package ch10Templatepattern.thirdcode;

public class TestPaper {
	public void testQuestion1()
	{
		System.out.println("杨过得到，后来给了郭靖，练成倚天剑，屠龙刀的玄铁可能是【】 A 球墨铸铁 B 马口铁 C 高速合金钢 D碳素纤维");
		System.out.println("答案是："+answer1());
	}
	public void testQuestion2()
	{
		System.out.println("杨过、程英、陆无双铲除了情花，造成【】 A 是这种植物不在害人"
				+ " B 使一种珍稀物种灭绝 C 破坏了那个生物圈的生态平衡 D 造成了该地区的沙漠化");
		System.out.println("答案是："+answer2());
	}
	public void testQuestion3() 
	{
		System.out.println("杨过得到，后来给了郭靖，练成倚天剑，倚天剑的玄铁可能是【】 A 球墨铸铁 B 马口铁 C 高速合金钢 D碳素纤维");
		System.out.println("答案是："+answer3());
	}
	protected String answer1()
	{
		return "";
	}
	protected String answer2()
	{
		return "";
	}
	protected String answer3()
	{
		return "";
	}

}
class TestPaperA extends TestPaper
{

	@Override
	protected String answer1() {
		// TODO Auto-generated method stub
		return "A";
	}

	@Override
	protected String answer2() {
		// TODO Auto-generated method stub
		return "B";
	}

	@Override
	protected String answer3() {
		// TODO Auto-generated method stub
		return "C";
	}


}

class TestPaperB extends TestPaper
{

	@Override
	protected String answer1() {
		// TODO Auto-generated method stub
		return "C";
	}

	@Override
	protected String answer2() {
		// TODO Auto-generated method stub
		return "A";
	}

	@Override
	protected String answer3() {
		// TODO Auto-generated method stub
		return "B";
	}

	
}