package ch17_adapterpattern.matephone;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //买了一个一台MatePhone
        MatePhone matePhone = new MatePhone();
        //有一个插入到圆孔就可以听歌的旧耳机
        Circle circle = new Earphone();
        //买一个适配器
        Adapter adpter = new Adapter();
        //适配器上插上耳机
        adpter.setCircle(circle);
        //在Typec口上插上买的适配器
        matePhone.setTypec(adpter);
        //通过适配器实现了用Typec口听歌
        matePhone.listenMusic();
    }
}
