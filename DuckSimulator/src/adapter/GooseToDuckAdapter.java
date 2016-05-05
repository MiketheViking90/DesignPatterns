package adapter;

import birds.AbstractDuck;
import birds.Goose;

public class GooseToDuckAdapter extends AbstractDuck {

    private Goose goose;

    public GooseToDuckAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
