package ch18mementopattern.normalmemento;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("Off");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();
    }

}
