package domain.object.impl;

import domain.behavior.impl.Flightless;
import domain.object.Duck;

public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name);
        flyBehavior = new Flightless();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
