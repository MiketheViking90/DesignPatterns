package bird.impl;

import bird.Turkey;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("Small flaps...");
    }

}
