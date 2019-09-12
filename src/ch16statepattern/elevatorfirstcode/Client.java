package ch16statepattern.elevatorfirstcode;

public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Elevator elevator = new Elevator();
        elevator.setState(elevator.STOPOPENED_STATE);
        elevator.setDirection(elevator.UPWARD);
        elevator.open();
        elevator.close();
        elevator.start();
        elevator.stop();
    }

}
