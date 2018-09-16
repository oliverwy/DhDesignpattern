package ch9.serializeDeepClonePrototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//使用Serialize方法实现，
//借鉴https://github.com/echoTheLiar/JavaCodeAcc/blob/master/src/designpattern/prototype/Resume.java
public class WorkExperience implements Serializable { // 深度复制，看看如何处理复制复杂数据结构
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

class Resume implements Cloneable, Serializable {
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;

	public Resume(String name) {
		super();
		this.name = name;
		this.work = new WorkExperience();
	}

	public Resume() {
		this.work = new WorkExperience();
	}

	public void setPersionInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	public void setWorkExprience(String workdate, String company) {
		this.work.setWordate(workdate);
		this.work.setCompany(company);
		;
	}

	public void display() {
		System.out.printf("\n %s %s %s", name, sex, age);
		System.out.printf("\n 工作经历：%s %s", work.getWordate(), work.getCompany());
	}

	public Object Clone() {
		Object object = null;
		// TODO Auto-generated method stub
		try {
			object = super.clone();

		} catch (CloneNotSupportedException exception) {

			System.err.println("Not support cloneable");
		}
		return (Object) object;
	}

	public Object deepClone() throws IOException, ClassNotFoundException {
		// 将对象写入流内
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		// 从流内读出对象
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
		return ois.readObject();

	}
}