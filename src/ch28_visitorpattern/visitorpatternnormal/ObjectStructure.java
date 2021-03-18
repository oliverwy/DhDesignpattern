package ch28_visitorpattern.visitorpatternnormal;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Element> elements = new ArrayList<Element>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void display(Vistor visitor) {
        for (Element p : elements) {
            p.accept(visitor);
        }
    }
}
