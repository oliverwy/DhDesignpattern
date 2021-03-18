package ch14_Observerpattern.NormaldelegatePattern;

import java.util.Date;

public class NbaObserver implements RegisterInform {

    public NbaObserver() {
        // TODO Auto-generated constructor stub
        System.out.println("我正在看NBA直播,老板回来及时通知我啊：" + new Date());
    }

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

    public void closeNbaLive(Date date) {
        System.out.println("老板回来了，快关NBA直播闭电视。结束时间" + date);
    }

}
