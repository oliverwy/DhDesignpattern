package principlesofSoftwareDesign.DemeterPrinciple;

// 维修师傅
class FWorker {
    public void doWork() {
        FTool tool = new FTool();
        System.out.println("维修师傅用" + tool.getName() + "在维修空调");
    }
}

// 工具类
class FTool {
    public String getName() {
        return "扳手";
    }
}

// 空调机主是不关心工具了，但是 空调机主孩子啊一步步指挥维修工怎么修，
// 现在这与实际的业务不相符实际情况是，工作自己决定怎么做。
class FAirConditionerOwner {
    private FWorker worker;

    public FAirConditionerOwner() {
        worker = new FWorker();
    }

    public void command() {
        worker.doWork();
    }
}

public class FirstOptimization {
    public static void main(String[] args) {
        FAirConditionerOwner ac = new FAirConditionerOwner();
        ac.command();
    }
}
