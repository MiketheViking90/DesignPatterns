package domain.object.impl;

import domain.behavior.FlyBehavior;
import domain.behavior.impl.Flightless;
import domain.object.Duck;
import lombok.Setter;

public class RubberDuck extends Duck {

    @Setter private FlyBehavior flyBehavior;

    public RubberDuck(String name) {
        super(name);
        flyBehavior = new Flightless();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
