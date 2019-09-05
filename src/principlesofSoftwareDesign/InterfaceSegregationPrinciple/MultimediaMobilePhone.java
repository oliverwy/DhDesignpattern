package principlesofSoftwareDesign.InterfaceSegregationPrinciple;

import javax.print.attribute.standard.Media;

interface MMIPhone {
    // 打电话
    void call(String number);

    // 发短信
    void sendMessage(String number, String content);

    // 拍照
    void takePicture();

    // 播放媒体
    void play(Media media);
}


public class MultimediaMobilePhone implements IPhone {
    // 打电话
    public void call(String number) {
        System.out.println("打电话给" + number);
    }

    // 发短信
    public void sendMessage(String number, String content) {
        System.out.println("给" + number + "发短信，内容是" + content);
    }

    // 拍照
    public void takePicture() {
        System.out.println("拍照");
    }

    // 播放媒体
    public void play(Media media) {
        System.out.println("播放" + media.getName());
    }
}

