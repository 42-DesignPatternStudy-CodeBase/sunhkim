package command.receiver;

public class CeilingFan {
    String location;
    public CeilingFan(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println(location + " ceilingFan is on");
    }
    public void off() {
        System.out.println(location + " ceilingFan is off");
    }
}
