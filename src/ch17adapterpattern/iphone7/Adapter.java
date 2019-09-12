package ch17adapterpattern.iphone7;

//适配器实现了lightning口，可以插入到lightning口
public class Adapter implements Lightning {
    //同时有耳机圆孔
    public Circle circle;

    public Adapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void listenMusic() {
        // TODO 自动生成的方法存根
        circle.listenMusic();
    }

}