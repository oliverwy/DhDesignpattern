package ch17_adapterpattern.iphone7;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //买了一个一台iphone7
        IPhone7 iphone = new IPhone7();
        //有一个插入到圆孔就可以听歌的旧耳机
        Circle circle = new Earphone();
        //买一个适配器，适配器上插上耳机
        Adapter adpter = new Adapter(circle);
        //在lightning口上插上买的适配器
        iphone.setLightning(adpter);
        //通过适配器实现了用lightning口听歌
        iphone.listenMusic();
    }

}
