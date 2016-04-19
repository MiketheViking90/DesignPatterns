package receiver.impl;

import lombok.Getter;

public class Stereo {

    @Getter private boolean isOpen;
    @Getter private String name;

    public Stereo() {
        isOpen = false;
        name = "Stereo";
    }

    public void eject() {
        isOpen = !isOpen;
    }

}
