package principlesofSoftwareDesign.InterfaceSegregationPrinciple;

import javax.print.attribute.standard.Media;

public class ElderlyMachine implements MMIPhone {
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
        // 空实现
    }

    // 播放媒体
    public void play(Media media) {
        // 空实现
    }
}

//有问题了，明显takePicture，和play(Media media)对老人机来说是不需要的，这个时这个接口对老人机就是个负担了