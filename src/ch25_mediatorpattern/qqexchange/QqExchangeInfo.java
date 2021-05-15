package ch25_mediatorpattern.qqexchange;

public interface QqExchangeInfo {
    public void addFriend(QQUser freind);
    public void sendMessage(String freMessage);
    public void displayInfo();
}

class QQUser implements QqExchangeInfo {
    private String reciveMessage;
    private String name;
    private QQUser fri;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QqExchangeInfo getFri() {
        return fri;
    }

    public void setFri(QQUser fri) {
        this.fri = fri;
    }

    public String getReciveMessage() {
        return reciveMessage;
    }

    public void setReciveMessage(String reciveMessage) {
        this.reciveMessage = reciveMessage;
    }

    @Override
    public void addFriend(QQUser freind) {
        this.fri = freind;
    }

    @Override
    public void sendMessage(String friMessage) {
        fri.setReciveMessage(friMessage);
    }

    @Override
    public void displayInfo() {
        String recMessage = "我是" + getName() + "收到" + fri.getName() + "发给我的的：" + getReciveMessage();
        System.out.println(recMessage);
    }
}
