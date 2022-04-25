package ch17_adapterpattern.matephone;

public class MatePhone {
    //MatePhone有Typec口，没有听歌用的圆孔
    private Typec typec;

    public void setTypec(Typec typec) {
        this.typec = typec;
    }

    //听歌只能用typec口
    public void listenMusic() {
    	typec.listenMusic();
    }
}

