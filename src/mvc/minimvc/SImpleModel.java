package mvc.minimvc;

public class SImpleModel {
	public void insertDbData(String s) {
		System.out.println("向数据库增加数："+s);
	}
	
	public String getDataFromDB()
	{
		return "从数据库返回的信息";
	}
}
