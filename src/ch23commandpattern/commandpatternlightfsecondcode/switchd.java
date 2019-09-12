package ch23commandpattern.commandpatternlightfsecondcode;

public class switchd {
    public static void main(String[] args) {
        Line line = new Line();
        line.connect();
        line.disconnect();
        line.connect();
        line.disconnect();
    }
}

