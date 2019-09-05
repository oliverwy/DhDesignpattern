package principlesofSoftwareDesign.LiskovSubstitutionPrinciple;

//子类不能覆盖父类的实方法
//父类
class Parent {
	// 父类中已经实现好的方法: 求和功能 如果为了满足里氏替换子类就不能覆盖这个方法
	public int Plus(int a, int b) {
		return (a + b);
	}
	public int OverrideOper(int a,int b) {
		return 0;
	};
}

//子类1 覆盖了父类的方法不满足里斯替换
class Son1 extends Parent {

	// 覆盖重写父类中的getSum()方法: 相减功能 覆盖就不满足
	@Override
	public int Plus(int a, int b) {
		return (a - b);
	}

	@Override
	public int OverrideOper(int a, int b) {
		// TODO Auto-generated method stub
		
		return a*b;
	}

}

//子类2 仅仅覆盖了应该父类没有实现的方法，满足里氏替换
class Son2 extends Parent {

//	仅仅实现了虚方法，这个满足
	@Override
	public int OverrideOper(int a, int b) {
		// TODO Auto-generated method stub
		return a^b;
	}

}



//测试类：使用子类替换掉父类的新程序
public class Test1 {

	public static void main(String[] args) {

//		使用父类完成的计任务
		Parent p=new Parent();
		System.out.println("使用父类完成计算");
		
		// 1: 使用子类替换掉父类
		Son2 son1 = new Son2();
		System.out.println(son1.OverrideOper(1, 2));
		Parent fath=null;
		fath=son1;
		// 2: 原程序需要的是求和功能，此时同一方法却变成了相减功能。
		int num = fath.OverrideOper(1, 2);
		System.out.println(num);
		System.out.println(fath.OverrideOper(2, 3));

	}

}
