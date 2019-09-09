package mvc.databaseapp.mvcobserverapp;


public interface Observable {
     public void notifyObservers();
     public void register(Observer obs);
}
