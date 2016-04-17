package request.impl;

import lombok.Getter;

public class GarageDoor {

    @Getter private boolean isOpen;

    public GarageDoor() {
        isOpen = false;
    }

    public void toggleDoor() {
        String doorState;

        isOpen = !isOpen;
        if (isOpen) {
            doorState = "open";
        } else {
            doorState = "closed";
        }
        System.out.println("door is " + doorState );
    }
}
