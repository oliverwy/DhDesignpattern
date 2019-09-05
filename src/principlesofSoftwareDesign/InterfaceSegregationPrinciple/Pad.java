package principlesofSoftwareDesign.InterfaceSegregationPrinciple;

import javax.print.attribute.standard.Media;

public class Pad implements MMIPhone {
    // 打电话
    public void call(String number) {
        // 空实现
    }

    // 发短信
    public void sendMessage(String number, String content) {
        // 空实现
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

//后来公司发展了，出一款Pad平板，平板只有拍照和播放媒体的功能，还是使用MMIPhone接口,call,sendMessage显然是负担