package factory.impl;

import adapter.GooseToDuckAdapter;
import behaviors.Quackable;
import birds.DuckCall;
import birds.Goose;
import birds.MallardDuck;
import birds.RedheadDuck;
import birds.RubberDuck;
import factory.AbstractDuckFactory;

public class DuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createGooseDuck() {
        Goose goose = new Goose();
        return new GooseToDuckAdapter(goose);
    }

}
