package ch14Observerpattern.NormaldelegatePattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Event> observers = new ArrayList();

    public void attach(String method, Object obj, Object[] params) {
        Event e = new Event(obj, method, params);
        if (observers.size() > 0) {
            int x;
            for (x = 0; x < observers.size(); x++) {
                Event event = (Event) observers.get(x);
                if (((e.getParams() == event.getParams()) && (e.getMethodName() == event.getMethodName())
                        && (e.getObject() == event.getObject()))) {
                    break;
                }
            }
            if (x >= observers.size())
                this.observers.add(e);
        } else
            this.observers.add(e);
    }

    public void detach(String method, Object obj, Object[] params) {
        Event e = new Event(obj, method, params);
        if (this.observers.size() > 0) {
            for (int x = 0; x < observers.size(); x++) {
                Event event = (Event) observers.get(x);
                if (((e.getParams() == event.getParams()) && (e.getMethodName() == event.getMethodName())
                        && (e.getObject() == event.getObject()))) {
                    this.observers.remove(x);
                }
            }
        }
    }

    // 通知
    public void notifys() {
        for (Event event : observers) {
            try {
                event.invoke();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
