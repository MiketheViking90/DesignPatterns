package command.impl;

import command.Command;
import receiver.impl.Light;

public class LightCommand implements Command {

    private static final String DISPLAY_FORMAT = "%s is on: %s";
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightSwitch();

        printExecution();
    }

    private void printExecution() {
        String msg = String.format(DISPLAY_FORMAT, light.getName(), light.isOn());
        System.out.println(msg);
    }
}
