package ch28visitorpattern.visitorpatternnormalbill;

//收入账目结构，允许任何人查看，相当于具体元素
public class IncomeBill implements Bill {
	private double amount;
	private String item;
	public IncomeBill(double amount, String item) {
		super();
		this.amount = amount;
		this.item = item;
	}
	public void openBy(AccountBookViewer viewer) {
		viewer.incomeView(this);
	}
	public double getAmount() {
		return amount;
	}
	public String getItem() {
		return item;
	}
}
