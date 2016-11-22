package decorator;

import behaviors.Quackable;
import birds.AbstractDuck;
import lombok.Getter;

public class QuackCounter extends AbstractDuck {

    private Quackable duck;
    @Getter private static int count = 0;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        count = 0;
    }

    @Override
    public void quack() {
        duck.quack();
        count++;
    }

}
