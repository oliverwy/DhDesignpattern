package ch08_factorypattern.factory;

import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        Operation oper;
        IFactory operFactory = null;
        System.out.println("请选择运算符号(+、-、*、/)：");
        String strOperate = scanner.next();
        switch (strOperate) {
            case "+":
                operFactory = new AddFactory();
                break;
            case "-":
                operFactory = new SubFactory();
                break;
            case "*":
                operFactory = new MulFactory();
                break;
            case "/":
                operFactory = new DivFactory();
                break;
        }
        oper = operFactory.createOperation();      //创建相应的运算类的对象

        System.out.println("请输入数字A：");
        oper.setNumberA(scanner.nextDouble());
        System.out.println("请输入数字B：");
        oper.setNumberB(scanner.nextDouble());

        double result = oper.getResult();                       //调用相应运算类中的getResult函数
        System.out.println("结果是：" + result);
        scanner.close();
    }

}
