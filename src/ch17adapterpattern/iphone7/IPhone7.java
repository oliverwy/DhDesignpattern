package ch17adapterpattern.iphone7;

public class IPhone7 {
    //iphone7有lightning口，没有听歌用的圆孔
    public Lightning lightning;

    public void setLightning(Lightning lightning) {
        this.lightning = lightning;
    }

    //听歌只能用lightning口
    public void listenMusic() {
        lightning.listenMusic();
    }
}

