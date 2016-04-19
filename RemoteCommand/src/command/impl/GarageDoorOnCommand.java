package command.impl;

import command.Command;
import receiver.impl.GarageDoor;

public class GarageDoorOnCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.toggleDoor();
    }
}
