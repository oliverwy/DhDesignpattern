package ch01_simplefactory.protye;

import java.util.Scanner;

public class NewProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A：");
        double numberA = scanner.nextDouble();
        System.out.println("请选择运算符号(+、-、*、/)：");
        String strOperate = scanner.next();
        System.out.println("请输入数字B：");
        double numberB = scanner.nextDouble();

        double result = Operation.getResult(numberA, numberB, strOperate);       //调用运算类的getResult方法
        System.out.println("结果是：" + result);
    }

}
