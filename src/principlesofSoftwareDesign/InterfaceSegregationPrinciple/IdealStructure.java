package principlesofSoftwareDesign.InterfaceSegregationPrinciple;

import javax.print.attribute.standard.Media;

interface IFunctionPhone {
    // 打电话
    void call(String number);

    // 发短信
    void sendMessage(String number, String content);
}

interface IMediaPhone {
    // 拍照
    void takePicture();

    // 播放媒体
    void play(Media media);
}

// 多媒体手机
class Phone implements IFunctionPhone, IMediaPhone {
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

// 老人机功能机
class FunctionPhone implements IFunctionPhone {
    // 打电话
    public void call(String number) {
        System.out.println("打电话给" + number);
    }

    // 发短信
    public void sendMessage(String number, String content) {
        System.out.println("给" + number + "发短信，内容是" + content);
    }
}

// 平板
class MPad implements IMediaPhone {
    // 拍照
    public void takePicture() {
        System.out.println("拍照");
    }

    // 播放媒体
    public void play(Media media) {
        System.out.println("播放" + media.getName());
    }
}

public class IdealStructure {
}

//小接口，每个接口专注与一类服务，这就是接口隔离