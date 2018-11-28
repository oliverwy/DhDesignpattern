package ch2strategepattern.moivefactory;


public class MovieTicket {//电影票类  
	private IdiscountFactory idiscountFactory;
	private DiscountType discountType;
	private double price; // 电影票价格
	private String type; // 电影票类型
	public void setPrice(double price) {
		this.price = price;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return this.calculate();
	}
	public double calculate() {	// 计算打折之后的票价
		if (this.type.equalsIgnoreCase("student")) {// 学生票折后票价计算
//			System.out.println("学生票：");
			idiscountFactory=new StudentDiscountFactory();
		}		// 儿童票折后票价计算
		else if (this.type.equalsIgnoreCase("children") && this.price >= 20) {
			idiscountFactory=new ChildrenDiscountFactory();
		}
		else if (this.type.equalsIgnoreCase("vip")) {
			idiscountFactory=new VipDiscountFactory();
		} else { 		// VIP票折后票价计算
			return this.price; // 如果不满足任何打折要求，则返回原始票价
		}
		discountType=idiscountFactory.createDiscount();
		discountType.setPrice(this.price);
		return discountType.getResultPrice();
	}
}
