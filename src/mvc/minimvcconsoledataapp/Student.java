package mvc.minimvcconsoledataapp;

public class Student {

	private String id;
	private String name;
	private String gender;
	private int age;
	private String major;
	private String dept;
	private String addr;

	public Student(String id, String name, String gender, int age, String major, String dept, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
		this.dept = dept;
		this.addr = addr;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
