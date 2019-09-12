package ch24chainofresponsibilitypattern.firstcode;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Manager jinli = new Manager("金利");
        Manager zongjian = new Manager("宗建");
        Manager zongjingli = new Manager("钟经理");
        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪");
        request.setNumber(1000);

        jinli.getResult("经理", request);
        zongjian.getResult("总监", request);
        zongjingli.getResult("总经理", request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(3);

        jinli.getResult("经理", request2);
        zongjian.getResult("总监", request2);
        zongjingli.getResult("总经理", request2);

    }

}
