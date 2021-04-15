package ch28_visitorpattern.visitorpatternnormalbill;

//账本查看者接口（相当于Visitor） 
//每个角色对不同元素的视角接口
public interface AccountBookViewer {
    //查看支出的的条目
    public double countConsumeView(ConsumeBill bill);

    //查看收入的条目
    public double countIncomeView(IncomeBill bill);

    public double getConsumeTotal(); //都可以查看总值

    public double getImcomeTotal(); //都可以查看总值
}
