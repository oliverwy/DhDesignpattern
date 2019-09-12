package ch14Observerpattern.firstcode;

import java.util.ArrayList;
import java.util.List;

class Secretary {
    public String SecretaryAction;
    private List<StockObserver> observers = new ArrayList<StockObserver>();

    public void Attach(StockObserver observer) {
        observers.add(observer);
    }

    public void notifys() {
        for (StockObserver o : observers) {
            o.Update();
        }
    }

    public String getSecretaryAction() {
        return SecretaryAction;
    }

    public void setSecretaryAction(String secretaryAction) {
        SecretaryAction = secretaryAction;
    }

}

class StockObserver {
    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        super();
        this.name = name;
        this.sub = sub;
    }

    public void Update() {
        System.out.printf("%s %s关闭股票行情，继续工作\n ", sub.SecretaryAction, name);
    }
}
