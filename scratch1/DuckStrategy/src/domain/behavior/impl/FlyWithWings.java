package domain.behavior.impl;

import domain.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flap flap flap");
    }
}
