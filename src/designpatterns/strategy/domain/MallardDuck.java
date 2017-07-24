package designpatterns.strategy.domain;

import designpatterns.strategy.strategies.FlyWithWings;
import designpatterns.strategy.strategies.Flyable;
import designpatterns.strategy.strategies.Quack;
import designpatterns.strategy.strategies.Quackable;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    private MallardDuck(Flyable fly, Quackable quack) {
        super(fly, quack);
    }

    @Override
    void swim() {

    }

    @Override
    void display() {

    }

}
