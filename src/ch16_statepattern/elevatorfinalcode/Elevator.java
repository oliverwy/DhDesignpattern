package ch16_statepattern.elevatorfinalcode;

public class Elevator {
    private AbstactStateInterface state;

    public AbstactStateInterface getState() {
        return state;
    }

    public void setState(AbstactStateInterface state) {
        this.state = state;
    }

    public void open() {
        this.state.open(this);
    }

    public void close() {
        this.state.close(this);
    }

    public void start() {
        this.state.start(this);
    }

    public void stop() {
        this.state.stop(this);
    }

    public void upward() {
        this.state.upward(this);

    }

    public void downward() {
        this.state.downward(this);
    }
}
