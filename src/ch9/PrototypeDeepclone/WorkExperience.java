package ch9.PrototypeDeepclone;

public class WorkExperience { //试试浅度复制能不能复制复杂的数据结构
	private String wordate;
	private String company;
	public String getWordate() {
		return wordate;
	}
	public void setWordate(String wordate) {
		this.wordate = wordate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

}

class Resume implements Cloneable
{
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;
	
	public Resume(String name) {
		super();
		this.name = name;
		this.work = new WorkExperience();
	}

	public void setPersionInfo(String sex,String age)
	{
		this.sex=sex;
		this.age=age;
	}
	public void setWorkExprience(String workdate,String company)
	{
		this.work.setWordate(workdate);
		this.work.setCompany(company);;
	}
	
	public void display()
	{
		System.out.printf("\n %s %s %s",name,sex,age);
		System.out.printf("\n 工作经历：%s %s",work.getWordate(),work.getCompany());
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