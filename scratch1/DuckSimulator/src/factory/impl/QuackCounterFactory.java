package factory.impl;

import adapter.GooseToDuckAdapter;
import behaviors.Quackable;
import birds.DuckCall;
import birds.Goose;
import birds.MallardDuck;
import birds.RedheadDuck;
import birds.RubberDuck;
import decorator.QuackCounter;
import factory.AbstractDuckFactory;

public class QuackCounterFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGooseDuck() {
        Goose goose = new Goose();
        return new QuackCounter(new GooseToDuckAdapter(goose));
    }

}
