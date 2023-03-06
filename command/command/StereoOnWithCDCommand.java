package command.command;

import command.Command;
import command.receiver.Stereo;

public class StereoOnWithCDCommand implements Command{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
    	this.stereo = stereo;
    }

	@Override
	public void execute() {
        stereo.onWithCD();
    }
}
