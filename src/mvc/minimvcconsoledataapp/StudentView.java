package mvc.minimvcconsoledataapp;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentView {
	
	public Student getNewStudent() {
		Student student=new Student();

		student.setId("1001");
		student.setName("测试姓名");
		student.setGender("男");
		student.setAge(19);
		student.setMajor("计算机科学技术");
		student.setDept("计算机");
		student.setAddr("安徽合肥");
		return student;
	};
	public void displayAllDetail(ArrayList<Student> s)
	{
		Iterator<Student>  sIterator=s.iterator();
		while (sIterator.hasNext())
		{
			Student student=(Student) sIterator.next();
			System.out.println(student.getId()+"--"+student.getName()
			+"--"+student.getGender()+"--"+student.getAge()
			+"--"+student.getMajor()+"--"+student.getDept()
			+"--"+student.getAddr()+"--"+student.getGender());
		}
	}
	
	public Student getDeleteStudentInfo()
	{
		Student student=new Student();
		student.setId("1001");
		return student;
	}
	
	public Student getUpdateStudentInfo() {
		Student student=new Student();
		student.setId("1001");
		student.setName("没有名字");
		student.setGender("男");
		student.setAge(30);
		student.setMajor("软件工程");
		student.setDept("计算机");
		student.setAddr("安徽合肥");
		return student;
	}
}
