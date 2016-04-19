package receiver.impl;

import lombok.Getter;

public class Light {

    @Getter private boolean isOn;
    @Getter protected String name;

    public Light() {
        name = "Light";
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
        }
    }

    public void lightSwitch() {
        isOn = !isOn;
    }
}
