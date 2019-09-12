package ch26flyweightpattern.flyweightwebsite;

import java.util.Hashtable;

public abstract class WebSite {
    public abstract void use();
}

class ConcreteWebSite extends WebSite {
    private String name = "";

    public ConcreteWebSite(String name) {
        super();
        this.name = name;
    }

    @Override
    public void use() {
        // TODO Auto-generated method stub
        System.out.println("网站分类：" + name);
    }
}

class WebSiteFactory {
    private Hashtable<String, ConcreteWebSite> flyweights = new Hashtable<String, ConcreteWebSite>();

    public WebSite getWebSiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            System.out.println("这个这个我目前还没这个类型保存起来哦！");
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return (WebSite) flyweights.get(key);
    }

    public int getWebSiteCount() {
        return flyweights.size();
    }
}