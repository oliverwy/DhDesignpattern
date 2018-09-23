package ch14.NormaldelegatePattern;

import java.util.Date;

public class StockObserver implements RegisterInform {
	
	@Override
	public void registerInform(Notifier object, String methodName, Object[] args) {
		// TODO Auto-generated method stub
		object.addMonitorInformObject(this, methodName, args);
	}
	@Override
	public void unRegisterInform(Notifier object, String methodName, Object[] args) {
		// TODO Auto-generated method stub
		object.removeMonitorInformObject(this, methodName, args);
	}
	public StockObserver() {
		// TODO Auto-generated constructor stub
		System.out.println("我开始看股票了啊，老板来了通知我，开始时间："+new Date());
	}
	public void closeStockMarket(Date date)
	{
		System.out.println("老板回来了，不要看股票了，结束时间："+date);
	}
	
}
