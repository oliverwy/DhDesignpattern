package ch28_visitorpattern.visitorpatternnormalbill;

//老板类，查看账本的类之一
public class Boss implements AccountBookViewer {
    private double totalIncome;
    private double totalConsume;

    // 老板只关注一共花了多少钱以及一共收入多少钱，其余并不关心
    public double countConsumeView(ConsumeBill bill) {
        totalConsume += bill.getAmount();
        return totalConsume;
    }

    public double countIncomeView(IncomeBill bill) {
        totalIncome += bill.getAmount();
        return totalIncome;
    }

    @Override
    public double getConsumeTotal() {
        System.out.println("老板查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }

    @Override
    public double getImcomeTotal() {
        System.out.println("老板查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }
}
