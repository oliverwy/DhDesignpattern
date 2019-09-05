package principlesofSoftwareDesign.DependenceInversionPrinciple;

// 生产一种产品没问题，
class Cane {
    public String toSugar() {
        return "甘蔗糖";
    }
}

class Machine {
    public void make(Cane cane) {
        System.out.println("生产" + cane.toSugar());
    }
}

public class prototypeprogram {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Cane cane = new Cane();
        machine.make(cane);
        // 生产甘蔗糖
    }
}
