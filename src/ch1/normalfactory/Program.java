package ch1.normalfactory;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		OperationFactory of = null;
		Operation oper;
		System.out.println("请选择运算符号(+、-、*、/)：");
		String strOperate = scanner.next();
		switch (strOperate) {
		case "+":
			of = new OperationAddfactory();
			oper = of.getOperation();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		}

		System.out.println("请输入数字A：");
//		oper.setNumberA(scanner.nextDouble());
		System.out.println("请输入数字B：");
//		oper.setNumberB(scanner.nextDouble());

//		double result = oper.getResult(); // 调用相应运算类中的getResult函数
		//System.out.println("结果是：" + result);
		scanner.close();
	}

}
