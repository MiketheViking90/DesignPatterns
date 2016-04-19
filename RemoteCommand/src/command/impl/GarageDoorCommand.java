package command.impl;

import command.Command;
import receiver.impl.GarageDoor;

public class GarageDoorCommand implements Command {

    private static final String DISPLAY_FORMAT = "%s is open: %s";
    private GarageDoor garageDoor;

    @Override
    public void execute() {
        garageDoor.toggleDoor();

        printExecution();
    }

    public GarageDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    private void printExecution() {
        String msg = String.format(DISPLAY_FORMAT, garageDoor.getName(), garageDoor.isOpen());
        System.out.println(msg);
    }
}
