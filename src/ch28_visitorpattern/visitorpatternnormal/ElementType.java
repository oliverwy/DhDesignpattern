package ch28_visitorpattern.visitorpatternnormal;

public interface ElementType {
    public abstract void accept(Vistor vistor);
}
