package command.command;

import command.receiver.Light;
import command.Command;

public class LightOnCommand  implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
