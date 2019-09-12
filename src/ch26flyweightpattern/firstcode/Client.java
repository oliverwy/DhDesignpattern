/**
 *
 */
package ch26flyweightpattern.firstcode;

/**
 * @author oliver
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebSite fx = new WebSite("产品展示");
        fx.use();

        WebSite fy = new WebSite("产品展示");
        fy.use();
        WebSite fz = new WebSite("产品展示");
        fz.use();
        WebSite fl = new WebSite("产品展示");
        fl.use();
        WebSite fm = new WebSite("博客");
        fm.use();
        WebSite fn = new WebSite("博客");
        fn.use();
        WebSite fc = new WebSite("博客");
        fc.use();
    }

}
