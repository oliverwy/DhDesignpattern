package ch9.initialcode;

public class Resume {
<<<<<<< HEAD
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
=======
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        super();
        this.name = name;
    }

    public void setPersionInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExprience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display() {
        System.out.printf("\n %s %s %s", name, sex, age);
        System.out.printf("\n 工作经历：%s %s", timeArea, company);
    }
>>>>>>> c8419c8a52c512e300f261ea04986559973a1601
}
