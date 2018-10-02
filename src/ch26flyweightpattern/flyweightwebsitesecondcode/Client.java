package ch26flyweightpattern.flyweightwebsitesecondcode;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteFactory f= new WebSiteFactory();
		WebSite fx=f.getWebSiteCategory("产品展示");
		fx.use(new User("小菜"));
		WebSite fy=f.getWebSiteCategory("产品展示");
		fy.use(new User("大鸟"));
		WebSite fa=f.getWebSiteCategory("产品展示");
		fa.use(new User("娇娇"));
		WebSite fz=f.getWebSiteCategory("博客");
		fz.use(new User("老顽童"));
		WebSite fp=f.getWebSiteCategory("博客");
		fp.use(new User("桃谷六仙"));
		WebSite fo=f.getWebSiteCategory("新闻网站");
		fo.use(new User("南海恶神") );
		WebSite fc=f.getWebSiteCategory("新闻网站");
		fc.use(new User("王阳明"));
		WebSite fb=f.getWebSiteCategory("BBS");
		fb.use(new User("黄老邪"));
		System.out.printf("得到网站分类总数为：%s",f.getWebSiteCount());
	}

}
