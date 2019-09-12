package ch25mediatorpattern.qqexchangemulti;

import java.util.ArrayList;
import java.util.List;

public interface QqExchangeInfo {
    public void addFriend(QQUser freind);

    public void removeFriend(String name);

    public String sendMessage(String name, String freMessage);

    public void displayInfo();
}

class QQUser implements QqExchangeInfo {
    private List<QQUser> friList;
    private String reciveMessage;
    private String sname;

    public QQUser() {
        super();
        this.friList = new ArrayList<QQUser>();
    }

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
    public void addFriend(QQUser freind) {
        if (friList.size() >= 0) {
            int x;
            for (x = 0; x < friList.size(); x++) {
                QQUser user = (QQUser) friList.get(x);
                if (user.getsName().equals(freind.getsName())) {
                    break;
                }
            }
            if (x >= friList.size()) {
                friList.add(freind);
            }
        } else {
            friList.add(freind);
        }
    }

    @Override
    public String sendMessage(String name, String friMessage) {
        int x;
        for (x = 0; x < friList.size(); x++) {
            if (friList.get(x).getsName().equals(name))
                friList.get(x).setReciveMessage(friMessage);
        }
        if (x >= friList.size())
            return "没有名字为" + name + "好友";
        else
            return "发送成功";

    }

    @Override
    public void displayInfo() {
        System.out.println(getReciveMessage());
    }

    @Override
    public void removeFriend(String name) {
        int x;
        System.out.println(name);
        for (x = 0; x < friList.size(); x++) {
            String sname = friList.get(x).getsName();
            if (sname == name) {
                friList.get(x).setReciveMessage("");
                friList.remove(x);
            }
        }
    }
}
