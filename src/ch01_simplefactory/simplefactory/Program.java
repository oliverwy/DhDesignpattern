package ch01_simplefactory.simplefactory;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operation oper;
        System.out.println("请选择运算符号(+、-、*、/)：");
        String strOperate = scanner.next();
        oper = OperationFactory.createOperate(strOperate);      //创建相应的运算类的对象

        System.out.println("请输入数字A：");
        oper.setNumberA(scanner.nextDouble());
        System.out.println("请输入数字B：");
        oper.setNumberB(scanner.nextDouble());
//
        double result = oper.getResult();                       //调用相应运算类中的getResult函数
        System.out.println("结果是：" + result);
        scanner.close();
    }

}
