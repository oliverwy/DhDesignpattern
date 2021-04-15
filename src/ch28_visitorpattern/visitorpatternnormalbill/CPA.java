package ch28_visitorpattern.visitorpatternnormalbill;

//注册会计师类，查看账本的类之一
public class CPA implements AccountBookViewer {
    // 注会在看账本时，则需要看应该交的税交了没
    private double consumeTotalTax;
    private double incomeTotalTax;

    @Override
    public double countConsumeView(ConsumeBill bill) {//支出税
        consumeTotalTax = consumeTotalTax + bill.getAmount() * 0.05;
        return consumeTotalTax;
    }

    @Override
    public double countIncomeView(IncomeBill bill) {//收入税
        incomeTotalTax = incomeTotalTax + bill.getAmount() * 0.17;
        return incomeTotalTax;
    }

    @Override
    public double getConsumeTotal() {
        System.out.println("注会查看账本时,则注会会查看支出交税：" + consumeTotalTax);
        return consumeTotalTax;
    }

    @Override
    public double getImcomeTotal() {
        System.out.println("注会查看账本时，只要是收入，注会查看公司交税:。" + incomeTotalTax);
        return incomeTotalTax;
    }
}
