package strategy.domain;

import strategy.strategies.Flyable;
import strategy.strategies.Quackable;

public abstract class Duck {

    Flyable flyable;
    Quackable quackable;

    protected Duck(Flyable fly, Quackable quack) {
        this.flyable = fly;
        this.quackable = quack;
    }

    abstract void swim();

    abstract void display();
}
