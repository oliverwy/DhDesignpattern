package ch1simplefactory.protye;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A：");
        double numberA = scanner.nextDouble();
        System.out.println("请选择运算符号(+、-、*、/)：");
        String strOperate = scanner.next();
        System.out.println("请输入数字B：");
        double numberB = scanner.nextDouble();
        double result = 0;

        switch (strOperate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                if (numberB != 0)
                    result = numberA / numberB;
                else
                    System.out.println("除数不能为0！");
                break;
        }
        System.out.println("结果是：" + result);
        scanner.close();
    }
}
