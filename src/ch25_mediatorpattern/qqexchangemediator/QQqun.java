package ch25_mediatorpattern.qqexchangemediator;

import java.util.ArrayList;
import java.util.List;

public interface QQqun {
    public abstract String send(String message, String name);

    public void attachQun(QQUser qu);

    public void detachQun(QQUser qu);
}

class ConcreteQQun implements QQqun {
    private List<QQUser> qunUserlist;

    public ConcreteQQun() {
        super();
        this.qunUserlist = new ArrayList<QQUser>();
    }

    @Override
    public String send(String message, String name) {
        // TODO Auto-generated method stub
        int x;
        for (x = 0; x < qunUserlist.size(); x++) {
            if (qunUserlist.get(x).getsName().equals(name))
                qunUserlist.get(x).setReciveMessage(message);
        }
        if (x >= qunUserlist.size())
            return "没有名字为" + name + "群友";
        else
            return "发送成功";

    }

    public void attachQun(QQUser qu) {
        int x;
        if (qunUserlist.size() >= 0) {
            for (x = 0; x < qunUserlist.size(); x++) {
                QQUser user = (QQUser) qunUserlist.get(x);
                if (user.getsName().equals(qu.getsName())) {
                    break;
                }
            }
            if (x >= qunUserlist.size()) {
                qunUserlist.add(qu);
            }
        } else {
            qunUserlist.add(qu);
        }
    }

    public void detachQun(QQUser qu) {
        int x;
        for (x = 0; x < qunUserlist.size(); x++) {
            QQUser user = (QQUser) qunUserlist.get(x);
            if (user.getsName().equals(qu.getsName())) {
                qunUserlist.get(x).setReciveMessage("已不再群");
                qunUserlist.remove(x);
            }
        }
    }

}