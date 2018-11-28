package ch2strategepattern.moivefactory;

abstract public class DiscountType {
	private double price;
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	abstract public double getResultPrice();
}

class StudentDiscount extends DiscountType
{
	@Override
	public double getResultPrice() {
		System.out.println("学生票："); 
		return getPrice()*0.8;
	}
}
class ChildrenDiscount extends DiscountType
{
	@Override
	public double getResultPrice() {
		System.out.println("儿童票：");
		if (getPrice()>20){
			return getPrice()-10;
		}
		else
			return getPrice();
	}
}
class VipDiscount extends DiscountType
{
	@Override
	public double getResultPrice() {
        System.out.println("VIP票：");  
        System.out.println("增加积分！");  
		return getPrice()*0.5;
	}
}