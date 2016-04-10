package domain.object.impl;

import domain.behavior.FlyBehavior;
import domain.object.Duck;
import lombok.Setter;

public class Mallard extends Duck{

    @Setter
    private FlyBehavior flyBehavior;

    public Mallard(String name) {
        super(name);
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }
}
