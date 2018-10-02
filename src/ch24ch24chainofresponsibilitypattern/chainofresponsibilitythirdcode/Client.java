package ch24ch24chainofresponsibilitypattern.chainofresponsibilitythirdcode;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonManager jinli=new CommonManager("金利");
		MajorDemo zongjian=new MajorDemo("宗建");
		GeneralManager zhongjingli=new GeneralManager("钟经理");
		
		jinli.setSuperior(zongjian);
		zongjian.setSuperior(zhongjingli);
		
		Request request=new Request();
		request.setRequestType("加薪");
		request.setRequestContent("小菜请求加薪");
		request.setNumber(1000);
		jinli.requestApplications(request);

		Request request2=new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小菜请假");
		request2.setNumber(3);
		
		jinli.requestApplications(request2);

		
	}

}
