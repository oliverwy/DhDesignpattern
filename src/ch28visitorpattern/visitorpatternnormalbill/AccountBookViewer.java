package ch28visitorpattern.visitorpatternnormalbill;

//账单查看者接口（相当于Visitor） 
//每个角色对不同元素的视角接口
public interface AccountBookViewer {
    //查看消费的单子
    void consumeView(ConsumeBill bill);

    //查看收入的单子
    void incomeView(IncomeBill bill);
}
