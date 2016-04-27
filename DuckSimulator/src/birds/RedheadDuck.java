package birds;

import behaviors.Quackable;

public class RedheadDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("quack");
    }

}
