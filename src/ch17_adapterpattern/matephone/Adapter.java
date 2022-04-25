package ch17_adapterpattern.matephone;

//适配器实现了Typec口，可以插入到Typec口
public class Adapter implements Typec {

	//同时有耳机圆孔
    private Circle circle;

    public void setCircle(Circle circle) {
		this.circle = circle;
	}
    
    @Override
    public void listenMusic() {
        // TODO 自动生成的方法存根
        circle.listenMusic();
    }

}