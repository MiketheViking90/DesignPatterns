package domain.behavior.impl;

import domain.behavior.FlyBehavior;

public class Flightless implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("nope");
    }
}
