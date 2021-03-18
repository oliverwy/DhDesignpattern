package ch14_Observerpattern.normalObserverpattern;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Subject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver("X", subject));
        subject.attach(new ConcreteObserver("Y", subject));
        subject.attach(new ConcreteObserver("Z", subject));
        subject.attach(new ConcreteObserver("O", subject));
        subject.attach(new ConcreteObserver("P", subject));
        subject.SubjectState = "ABC";
        subject.notifys();

    }

}
