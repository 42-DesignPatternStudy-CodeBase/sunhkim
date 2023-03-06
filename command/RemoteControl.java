package command;

import java.util.ArrayList;

// invoker
public class RemoteControl {
	private ArrayList<Command> onList = new ArrayList<Command>();
	private ArrayList<Command> offList = new ArrayList<Command>();
	
	public void setCommand(int idx, Command onCommand, Command offCommand) {
        this.onList.add(idx, onCommand);
        this.offList.add(idx, offCommand);
	}

	public void onButtonWasPushed(int idx) {
        this.onList.get(idx).execute();
	}

	public void offButtonWasPushed(int idx) {
        this.offList.get(idx).execute();
	}
}
