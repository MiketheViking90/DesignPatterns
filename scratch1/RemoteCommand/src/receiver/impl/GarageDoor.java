package receiver.impl;

import lombok.Getter;

public class GarageDoor {

    @Getter private boolean isOpen;
    @Getter private String name;

    public GarageDoor() {
        isOpen = false;
        name = "GarageDoor";
    }

    public void toggleDoor() {
        isOpen = !isOpen;
    }
}
