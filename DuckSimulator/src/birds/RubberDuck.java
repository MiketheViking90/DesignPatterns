package birds;

import behaviors.Quackable;

public class RubberDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("squeak");
    }

}
