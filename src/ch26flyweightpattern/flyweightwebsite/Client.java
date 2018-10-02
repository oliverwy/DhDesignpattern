package ch26flyweightpattern.flyweightwebsite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteFactory f= new WebSiteFactory();
		WebSite fx=f.getWebSiteCategory("产品展示");
		fx.use();
		WebSite fy=f.getWebSiteCategory("产品展示");
		fy.use();
		WebSite fz=f.getWebSiteCategory("博客");
		fz.use();
		WebSite fp=f.getWebSiteCategory("博客");
		fp.use();
		WebSite fo=f.getWebSiteCategory("新闻网站");
		fo.use();
		WebSite fc=f.getWebSiteCategory("新闻网站");
		fc.use();
		WebSite fb=f.getWebSiteCategory("BBS");
		fb.use();
		
	}

}
