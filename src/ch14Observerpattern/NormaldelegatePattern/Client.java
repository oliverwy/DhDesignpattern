package ch14Observerpattern.NormaldelegatePattern;

import java.util.Date;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notifier monitorScretetary=new MonitorInform();
		StockObserver stockObserver=new StockObserver();
		NbaObserver nbaObserver=new NbaObserver();
		Object[] param=new Object[] {new Date()};
		System.out.println("monitorScretetary监控类主动添加");
		monitorScretetary.addMonitorInformObject(stockObserver, "closeStockMarket", param);
		monitorScretetary.addMonitorInformObject(nbaObserver, "closeNbaLive",param);
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		monitorScretetary.notifys();
		System.out.println("nbaObserver 不愿意接收通知了");
		nbaObserver.unRegisterInform(monitorScretetary, "closeNbaLive", param);
		monitorScretetary.notifys();
		System.out.println("nbaObserver发觉应该接收通知了");
		nbaObserver.registerInform(monitorScretetary, "closeNbaLive", param);
		
		monitorScretetary.notifys();
		
		System.out.println("monitorScretetary 不愿意通知nbaObserver了");
		monitorScretetary.removeMonitorInformObject(nbaObserver, "closeNbaLive",param);
		monitorScretetary.notifys();

	}

}
