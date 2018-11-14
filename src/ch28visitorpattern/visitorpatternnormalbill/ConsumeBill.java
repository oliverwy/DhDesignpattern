package ch28visitorpattern.visitorpatternnormalbill;

//支出的账目 具体元素 允许任何人查看，没人查看的角度不同
public class ConsumeBill implements Bill {
	private double amount;
	private String item;
	public ConsumeBill(double amount, String item) {
		super();
		this.amount = amount;
		this.item = item;
	}
	// 不同人不同视角
	public void accept(AccountBookViewer viewer) {
		viewer.consumeView(this);
	}
	public double getAmount() {
		return amount;
	}
	public String getItem() {
		return item;
	}
}
