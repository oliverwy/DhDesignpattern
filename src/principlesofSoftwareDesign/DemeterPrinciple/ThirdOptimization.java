package principlesofSoftwareDesign.DemeterPrinciple;

// 维修师傅
class FFWorker {
    // 用扳手修空调
    private boolean doWork1() {
        BanShou tool = new BanShou();
        System.out.println("维修师傅用" + tool.getName() + "在维修空调，没修好");
        return false;
    }

    // 用螺丝刀修空调
    private boolean doWork2() {
        LuoSiDao tool = new LuoSiDao();
        System.out.println("维修师傅用" + tool.getName() + "在维修空调，没修好");
        return false;
    }

    // 用清洁工具修空调
    private boolean doWork3() {
        QingJieTool tool = new QingJieTool();
        System.out.println("维修师傅用" + tool.getName() + "在维修空调，修好了");
        return false;
    }

    // 修空调
    public void doWork() {
        if (doWork1()) {
            System.out.println("维修师傅使用扳手修好了空调");
        } else if (doWork2()) {
            System.out.println("维修师傅使用螺丝刀修好了空调");
        } else if (doWork3()) {
            System.out.println("维修师傅使用清洁工具修好了空调");
        } else {
            System.out.println("维修师傅修不好空调了");
        }
    }
}

// FFAirConditionerOwner请来师傅，然后说你干活吧，FFWorker修空调去了
class FFAirConditionerOwner {
    private FFWorker worker;//FFAirConditionerOwner请来师傅，

    public FFAirConditionerOwner() {
        worker = new FFWorker();
    }

    public void command() {//然后说你干活吧，FFWorker修空调去了,怎么修师傅说了算，这就是知道最少原则
        worker.doWork();
    }
}

public class ThirdOptimization {
    public static void main(String[] args) {
        SAirConditionerOwner ac = new SAirConditionerOwner();
        ac.command();
    }

}
