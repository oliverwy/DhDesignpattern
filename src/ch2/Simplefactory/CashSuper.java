package ch2.Simplefactory;

public abstract class CashSuper {
	public abstract double acceptCash(double money);

}

class CashNorml extends CashSuper{
	@Override
	public double acceptCash(double money) {
		return money;
	}
}

class CashRebate extends CashSuper{
	private double moneyRebate=1;

	public CashRebate(double moneyRebate) {
		super();
		this.moneyRebate = moneyRebate;
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money*moneyRebate;
	}
	
}

class CashReturn extends CashSuper{
	private double moneyCondition=0.0;
	private double moneyReturn=0.0;
	public CashReturn(double moneyCondition, double moneyReturn) {
		super();
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		double result=money;
		if (money>=moneyCondition) {
			result=money-(money/moneyCondition)*moneyReturn;
		}
		return result;
	}
	
}

