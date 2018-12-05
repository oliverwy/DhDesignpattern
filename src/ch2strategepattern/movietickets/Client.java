package ch2strategepattern.movietickets;


public class Client {

	public static void main(String[] args) {
		MovieTicket mt = new MovieTicket();
		Discount discount=null;
		double originalPrice = 60.0; // 原始票价
		double currentPrice; // 折后价

		mt.setPrice(originalPrice);
		System.out.println("原始价为：" + originalPrice);
		System.out.println("---------------------------------");
		discount=new StudentDiscount();
		mt.setDiscount(discount);
		currentPrice = mt.getPrice();
		System.out.println("折后价为：" + currentPrice);
		System.out.println("---------------------------------");
		discount=new ChildrenDiscount();
		mt.setDiscount(discount);
		currentPrice = mt.getPrice();
		System.out.println("折后价为：" + currentPrice);
		System.out.println("---------------------------------");
		discount=new VIPDiscount();
		mt.setDiscount(discount);
		currentPrice=mt.getPrice();
		System.out.println("折后价为：" + currentPrice);
		System.out.println("---------------------------------");
		discount=new VVIPDiscount();
		mt.setDiscount(discount);
		currentPrice=mt.getPrice();
		System.out.println("折后价为：" + currentPrice);
	}
}
