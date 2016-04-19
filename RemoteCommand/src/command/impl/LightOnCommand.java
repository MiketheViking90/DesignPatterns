package command.impl;

import command.Command;
import receiver.impl.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        String lightState;
        light.lightSwitch();

        if (light.isOn()) {
            lightState = "on";
        } else {
            lightState = "off";
        }

        System.out.println("light is " + lightState);
    }
}
