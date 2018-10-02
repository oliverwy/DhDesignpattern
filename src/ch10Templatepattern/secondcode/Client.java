package ch10Templatepattern.secondcode;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("学生甲抄的试卷：");
		TestPaperA  studentA=new TestPaperA();
		studentA.testQuestion1();
		studentA.testQuestion2();
		studentA.testQuestion3();
		System.out.println("学生乙抄的试卷：");
		TestPaperB studentB=new TestPaperB();
		studentB.testQuestion1();
		studentB.testQuestion2();
		studentB.testQuestion3();
	}

}
