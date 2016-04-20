package bird.impl;

import bird.Duck;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("Flap flap!");
    }
}
