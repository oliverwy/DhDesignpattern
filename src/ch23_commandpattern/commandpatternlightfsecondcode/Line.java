package ch23_commandpattern.commandpatternlightfsecondcode;

public class Line {
    private Hifi hifi;

    public Line() {
        super();
        this.hifi = new Hifi();
    }

    public void connect() {
        hifi.on();
    }

    public void disconnect() {
        hifi.off();
    }
}
