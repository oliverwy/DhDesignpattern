package ch1.simplefactory;

public class OperationFactory {
    //输入运算符号，实例化出相应的对象
    public static Operation createOperate(String operate) {   //返回值为Operation对象
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
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
        return oper;
    }
}
