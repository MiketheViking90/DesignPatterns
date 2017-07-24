package designpatterns.strategy.domain;

import designpatterns.strategy.strategies.Flyable;
import designpatterns.strategy.strategies.Quackable;

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
