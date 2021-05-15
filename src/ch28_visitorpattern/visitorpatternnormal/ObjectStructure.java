package ch28_visitorpattern.visitorpatternnormal;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<ElementType> elements =
    		new ArrayList<ElementType>();

    public void attach(ElementType element) {
        elements.add(element);
    }

    public void detach(ElementType element) {
        elements.remove(element);
    }

    public void display(Vistor visitor) {
        for (ElementType p : elements) {
            p.accept(visitor);
        }
    }
}
