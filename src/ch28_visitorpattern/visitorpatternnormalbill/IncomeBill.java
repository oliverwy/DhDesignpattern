package ch28_visitorpattern.visitorpatternnormalbill;

//收入账目结构，允许任何人查看，相当于具体元素
public class IncomeBill implements BillItem {
    private double amount;
    private String item;

    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    public void visitedBy(AccountBookViewer viewer) {
        viewer.countIncomeView(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
