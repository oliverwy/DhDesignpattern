package ch23_commandpattern.commandpatternlightfcommand;

public class switchd {
    public static void main(String[] args) {
        Appliance light = new Light();
        Appliance hifi = new Hifi();
        Command lightOn = new OnCommand(light);
        Command lightOff = new OffCommand(light);
        Command hifiOn = new OnCommand(hifi);
        Command hifiOff = new OffCommand(hifi);
        Line l = new Line();
        l.setCommand(hifiOn);
        l.notifys();
        l.setCommand(lightOn);
        l.notifys();
        l.setCommand(lightOff);
        l.notifys();
        l.setCommand(hifiOff);
        l.notifys();
    }
}

