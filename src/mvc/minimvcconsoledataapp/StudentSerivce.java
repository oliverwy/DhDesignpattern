package mvc.minimvcconsoledataapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class StudentSerivce {
	private static final String DBDRIVER = "org.sqlite.JDBC";
	private static final String DBCONNSTR = "jdbc:sqlite:infod.db";
	private DBApplication db;
	public StudentSerivce() {
		db=new DBApplication(DBDRIVER, DBCONNSTR);
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Student> getAllStudentInfo(){
		ArrayList<Student> students=new ArrayList();
		try {
		ResultSet rs=db.executeQuery("select * from student ");
			while (rs.next())
			{
				Student student=new Student(rs.getString(1),
						rs.getString(2),rs.getString(3),
						rs.getInt(4),rs.getString(5),
						rs.getString(6),rs.getString(7));
				students.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}
	public ArrayList<Student> getByPara(Student s){
		ArrayList<Student> students=new ArrayList();
		try {
		ResultSet rs=db.executeQuery("select * from student where id='"+s.getId()+"'");
			while (rs.next())
			{
				Student student=new Student(rs.getString(1),
						rs.getString(2),rs.getString(3),
						rs.getInt(4),rs.getString(5),
						rs.getString(6),rs.getString(7));
				students.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}

	public void createTable() {
		db.createTable();
	}
	
	public void insertStudent(Student s) {
		String sqlString="insert into student values('";

		sqlString=sqlString+s.getId()+"','"+s.getName()+"','"+s.getGender()+"',";
		sqlString=sqlString+s.getAge()+",'"+s.getMajor()+"','"+s.getDept()+"','"+s.getAddr()+"')";
		System.out.println(sqlString);
		db.executeInsert(sqlString);
	}
	
	public void deleteFromStudent(Student s) {
		String sqlString="delete from student where id='"+s.getId()+"'";
		System.out.println(sqlString);
		db.executeDelete(sqlString);
	}
	
	public void updateStudentInfo(Student s) {
		String sqlString="update student set name='"+s.getName()+"',gender='"+s.getGender()+
				"',age="+s.getAge()+",major='"+s.getMajor()+"',dept='"+s.getDept()
				+"',addr='"+s.getAddr()+"' where id='"+s.getId()+"'";
		System.out.println(sqlString);
		db.executeInsert(sqlString);
	
	}
			
}
