package birds;

import behaviors.Quackable;

public class DuckCall implements Quackable {

    @Override
    public void quack() {
        System.out.println("kwak");
    }

}
