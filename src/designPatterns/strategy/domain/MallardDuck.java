package strategy.domain;

import strategy.strategies.FlyWithWings;
import strategy.strategies.Flyable;
import strategy.strategies.Quack;
import strategy.strategies.Quackable;

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
