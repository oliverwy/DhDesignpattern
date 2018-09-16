package ch8.factory;

public abstract class Operation {
		private double numberA;                      //面向对象编程中，不允许外界直接对类的成员变量直接访问
	    private double numberB;                      //通过get、set方法来访问私有成员变量

	    public double getNumberA() {
	        return numberA;
	    }

	    public void setNumberA(double numberA) {
	        this.numberA=numberA;
	    }

	    public double getNumberB() {
	        return numberB;
	    }

	    public void setNumberB(double numberB) {
	        this.numberB=numberB;
	    }

	    public abstract double getResult();            //定义抽象方法，在子类中实现
}

class OperationAdd extends Operation { //加法类
    public double getResult() {
        double result;
        result=getNumberA()+getNumberB();
        return result;
    }
}

class OperationSub extends Operation {  //减法类
    public double getResult() {
        double result;
        result=getNumberA()-getNumberB();
        return result;
    }
}

class OperationMul extends Operation{  //乘法类
    public double getResult() {
        double result;
        result=getNumberA()*getNumberB();
        return result;
    }
}

class OperationDiv extends Operation{ //除法类
    public double getResult() {
        double result=0;
        if(getNumberB()!=0)
            result=getNumberA()/getNumberB();
        else
            System.out.println("除数不能为0！");
        return result;
    }
}