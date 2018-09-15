package ch2.strategechargesystem;

public interface CashSuper {
	public abstract double acceptCash(double money);

}

class CashNorml implements CashSuper{
	@Override
	public double acceptCash(double money) {
		return money;
	}
}

class CashRebate implements CashSuper{
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

class CashReturn implements CashSuper{
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

class CashContext{
	private CashSuper cs;

	public CashContext(CashSuper cs) {
		super();
		this.cs = cs;
	}
	public double GetResult(double money) {
		return cs.acceptCash(money);
	}
}
