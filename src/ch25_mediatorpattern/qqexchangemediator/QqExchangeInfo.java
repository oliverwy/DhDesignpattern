package ch25_mediatorpattern.qqexchangemediator;

public interface QqExchangeInfo {
    public void attachQun(QQqun qu);

    public void detach(QQqun qu);

    public String sendMessage(String name, String freMessage);

    public void displayInfo();
}

class QQUser implements QqExchangeInfo {
    private QQqun qun;
    private String reciveMessage;
    private String sname;

    public String getsName() {
        return sname;
    }

    public void setsName(String sname) {
        this.sname = sname;
    }

    public String getReciveMessage() {
        return reciveMessage;
    }

    public void setReciveMessage(String reciveMessage) {
        this.reciveMessage = reciveMessage;
    }

    @Override
    public void attachQun(QQqun qu) {
        this.qun = qu;
        this.qun.attachQun(this);
        // TODO Auto-generated method stub
    }

    @Override
    public void detach(QQqun qu) {
        this.qun.detachQun(this);
        // TODO Auto-generated method stub
    }

    @Override
    public String sendMessage(String name, String freMessage) {
        // TODO Auto-generated method stub
        return this.qun.send(freMessage, name);
    }

    @Override
    public void displayInfo() {
        // TODO Auto-generated method stub
        System.out.println(getReciveMessage());
    }
}
