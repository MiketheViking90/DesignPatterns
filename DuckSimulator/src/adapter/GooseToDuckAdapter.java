package adapter;

import behaviors.Quackable;
import birds.Goose;

public class GooseToDuckAdapter implements Quackable {

    private Goose goose;

    public GooseToDuckAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
