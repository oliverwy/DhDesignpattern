package ch28_visitorpattern.visitorpatternnormalbill;

//老板类，查看账本的类之一
public class Boss implements AccountBookViewer {
    private double totalIncome;
    private double totalConsume;

    // 老板只关注一共花了多少钱以及一共收入多少钱，其余并不关心
    public void consumeView(ConsumeBill bill) {
        totalConsume += bill.getAmount();
    }

    public void incomeView(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }

    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少，"
                + "数目是：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少"
                + "，数目是：" + totalConsume);
        return totalConsume;
    }
}
