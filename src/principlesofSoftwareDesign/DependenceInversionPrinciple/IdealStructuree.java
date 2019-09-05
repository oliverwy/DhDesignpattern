package principlesofSoftwareDesign.DependenceInversionPrinciple;

interface ISugar {
    public String toSugar();
}

class Cane1 implements ISugar {
    public String toSugar() {
        return "甘蔗糖";
    }
}

class Beet1 implements ISugar {
    public String toSugar() {
        return "白砂糖";
    }
}

class IdealMachine {
    public void make(ISugar sugar) {
        System.out.println("生产" + sugar.toSugar());
    }
}

public class IdealStructuree {
    public static void main(String[] args) {
        IdealMachine machine = new IdealMachine();
        Cane1 c1 = new Cane1();
        Beet1 b1 = new Beet1();
        machine.make(c1);
        machine.make(b1);
    }
}
