package ch16_statepattern.elevatorfinalcode;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AbstactStateInterface stateInterface = null;
        Elevator elevator = new Elevator();
        stateInterface = new LiftOffState();
        elevator.setState(stateInterface);
        elevator.start();
        elevator.stop();
        elevator.open();
        elevator.close();
        stateInterface = new DownRunningState();
        elevator.setState(stateInterface);
        elevator.start();
        elevator.stop();
        elevator.open();
        elevator.close();
    }

}
