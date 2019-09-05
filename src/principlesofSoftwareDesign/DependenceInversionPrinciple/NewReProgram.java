package principlesofSoftwareDesign.DependenceInversionPrinciple;


//增加一种可以生产糖，源代码补习做如下修改
//添加一个甜菜类
class Beet {
    public String toSugar() {
        return "白砂糖";
    }
}

//生产白糖的机器也要改
class NewMachine {
    public void make(Cane cane) {
        System.out.println("生产" + cane.toSugar());
    }

    public void make(Beet beet) {
        System.out.println("生产" + beet.toSugar());
    }
}

//前端的UI界面也要改
public class NewReProgram {
    public static void main(String[] args) {
        NewMachine machine = new NewMachine();
        Cane cane = new Cane();
        machine.make(cane);
        // 生产甘蔗糖
        Beet beet = new Beet();
        machine.make(beet);
    }
}
