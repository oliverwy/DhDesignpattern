package ch02_strategepattern.movietickets;

public interface Discount {
    public double calculate(double price);
}

class StudentDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}

//儿童票折扣类：具体策略类  
class ChildrenDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }
}

//VIP会员票折扣类：具体策略类  
class VIPDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * 0.5;
    }
}

//VIP会员票折扣类：具体策略类  
class VVIPDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("VVVVVVVIP票：");
        System.out.println("增加积分！");
        return price * 0.5 * 0.5;
    }
}