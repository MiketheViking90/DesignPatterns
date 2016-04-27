package birds;

import behaviors.Quackable;

public class MallardDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("quack");
    }

}
