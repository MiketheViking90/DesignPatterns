package client.impl;

import command.Command;
import command.impl.GarageDoorOnCommand;
import command.impl.LightOnCommand;
import request.impl.GarageDoor;
import request.impl.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl rc = new SimpleRemoteControl();
        Light light = new Light();
        Command lightSwitch = new LightOnCommand(light);

        rc.setSlot(lightSwitch);
        rc.pressButton();
        rc.pressButton();
        rc.pressButton();

        GarageDoor door = new GarageDoor();
        Command garageDongle = new GarageDoorOnCommand(door);

        rc.setSlot(garageDongle);
        rc.pressButton();
        rc.pressButton();
    }
}
