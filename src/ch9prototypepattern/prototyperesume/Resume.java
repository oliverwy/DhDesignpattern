package ch9prototypepattern.prototyperesume;

public class Resume implements Cloneable { //浅度Clone //类的属性都是简单数据类型
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	public Resume(String name) {
		super();
		this.name = name;
	}
	public void setPersionInfo(String sex,String age)
	{
		this.sex=sex;
		this.age=age;
	}
	public void setWorkExprience(String timeArea,String company)
	{
		this.timeArea=timeArea;
		this.company=company;
	}
	
	public void display()
	{
		System.out.printf("\n %s %s %s",name,sex,age);
		System.out.printf("\n 工作经历：%s %s",timeArea,company);
	}
	public Object Clone()
	{
		Object object = null;
		// TODO Auto-generated method stub
		try {
			object = super.clone();

		} catch (CloneNotSupportedException exception) {

			System.err.println("Not support cloneable");
		}
		return (Object)object;
	}
}
