package principlesofSoftwareDesign.DemeterPrinciple;

// 工具类
class Tool {
    public String getName() {
        return "扳手";
    }
}

// 维修师傅
class Worker {
    public void doWork(Tool tool) {
        System.out.println("维修师傅用" + tool.getName() + "在维修空调");
    }
}

// 空调机请来工人，买来了工具，把工具交给工人，工人才能使用工具维修空调，
// 显然这和实际的情况不一样，我们平时就是打个电话，工人来修，显然这个过程中
//AirConditionerOwner知道太多，知道太多容易出问题哦，无论生活中还是代码中
class AirConditionerOwner {
    private Worker worker;

    public AirConditionerOwner() {
        worker = new Worker();
    }

    public void command() {
        Tool tool = new Tool();
        worker.doWork(tool);
    }
}

public class PrototypeProblem {
    public static void main(String[] args) {
        AirConditionerOwner ac = new AirConditionerOwner();
        ac.command();
    }
}
/*
 *问题：家类Business，它的直接朋友类是维修师傅类Worker（出现在成员变量中），
 * 可是command方法内却出现结果陌生的工具类Tool。商家类Business其实并不需要知道工具类Tool的存在，
 * 他只与维修师傅类Worker打交道就行，至于师傅用什么工具，他不care的。
 *
 * */