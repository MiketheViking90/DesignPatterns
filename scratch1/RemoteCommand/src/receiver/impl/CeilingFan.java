package receiver.impl;

import lombok.Getter;

public class CeilingFan {

    @Getter private boolean isOn;
    @Getter private String name;

    public CeilingFan() {
        name = "CeilingFan";
    }

    public void toggle() {
        isOn = !isOn;
    }

}
