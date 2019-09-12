package ch23commandpattern.commandpatternlightfirstcode;

public class Client {
    public static void main(String[] args) {
        Hifi hifi = new Hifi();
        hifi.on();
        hifi.off();
        hifi.on();
        hifi.off();
    }
}

