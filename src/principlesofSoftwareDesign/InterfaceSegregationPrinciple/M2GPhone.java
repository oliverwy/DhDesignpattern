package principlesofSoftwareDesign.InterfaceSegregationPrinciple;

interface IPhone {
    // 打电话
    void call(String number);

    // 发短信
    void sendMessage(String number, String content);
}

public class M2GPhone implements IPhone {
    // 打电话
    public void call(String number) {
        System.out.println("打电话给" + number);
    }

    // 发短信
    public void sendMessage(String number, String content) {
        System.out.println("给" + number + "发短信，内容是" + content);
    }
}
