package principlesofSoftwareDesign.DemeterPrinciple;


// 工具接口
interface STool {

    public String getName();
}

// 扳手工具类
class BanShou implements STool {
    @Override
    public String getName() {
        return "扳手";
    }
}

// 螺丝刀工具类
class LuoSiDao implements STool {
    @Override
    public String getName() {
        return "螺丝刀";
    }
}

// 清洁工具工具类
class QingJieTool implements STool {
    @Override
    public String getName() {
        return "清洁工具";
    }
}

// 维修师傅
class SWorker {
    // 用扳手修空调
    public boolean doWork1() {
        BanShou tool = new BanShou();
        System.out.println("维修师傅用" + tool.getName() + "在维修空调，没修好");
        return false;
    }

    // 用螺丝刀修空调
    public boolean doWork2() {
        LuoSiDao tool = new LuoSiDao();
        System.out.println("维修师傅用" + tool.getName() + "在维修空调，没修好");
        return false;
    }

    // 用清洁工具修空调
    public boolean doWork3() {
        QingJieTool tool = new QingJieTool();
        System.out.println("维修师傅用" + tool.getName() + "在维修空调，修好了");
        return false;
    }
}

//
class SAirConditionerOwner {
    private SWorker worker;

    public SAirConditionerOwner() {
        worker = new SWorker();
    }

    public void command() {
        if (worker.doWork1()) {
            System.out.println("维修师傅使用扳手修好了空调");
        } else if (worker.doWork2()) {
            System.out.println("维修师傅使用螺丝刀修好了空调");
        } else if (worker.doWork3()) {
            System.out.println("维修师傅使用清洁工具修好了空调");
        } else {
            System.out.println("维修师傅修不好空调了");
        }
    }
}

//SAirConditionerOwner的确只与朋友类SWorker说话，但是不觉得SAirConditionerOwner还是管的太多了，
// 还要“指挥”维修师傅类SWorker怎么去修。这是因为维修师傅类SWorker“告诉”商家类SAirConditionerOwner太多“秘密”了，
// 也就是公布太多方法了！既然知道原因，那就把方法私有化
public class SecondOptimization {
    public static void main(String[] args) {
        SAirConditionerOwner ac = new SAirConditionerOwner();
        ac.command();
    }
}
