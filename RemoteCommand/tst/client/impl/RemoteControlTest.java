package client.impl;

import command.Command;
import command.impl.GarageDoorCommand;
import command.impl.LightCommand;
import receiver.impl.GarageDoor;
import receiver.impl.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl rc = new SimpleRemoteControl();
        Light light = new Light();
        Command lightSwitch = new LightCommand(light);

        rc.setSlot(lightSwitch);
        rc.pressButton();
        rc.pressButton();
        rc.pressButton();

        GarageDoor door = new GarageDoor();
        Command garageDongle = new GarageDoorCommand(door);

        rc.setSlot(garageDongle);
        rc.pressButton();
        rc.pressButton();
    }
}
