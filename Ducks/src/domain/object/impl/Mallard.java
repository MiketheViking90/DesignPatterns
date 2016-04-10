package domain.object.impl;

import domain.behavior.impl.FlyWithWings;
import domain.object.Duck;

public class Mallard extends Duck {

    public Mallard(String name) {
        super(name);
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
