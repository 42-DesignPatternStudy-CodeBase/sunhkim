package command.receiver;

public class Stereo {
    String location = "";

    public Stereo(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println(location + " stereo is on");
    }
	public void onWithCD() {
		System.out.println(location + " stereo is on with CD");
	}
    public void off() {
        System.out.println(location + " stereo is off");
    } 
}
