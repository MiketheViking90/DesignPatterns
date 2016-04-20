package adapter.impl;

import bird.Duck;
import bird.Turkey;

public class DuckAdapter implements Turkey {

    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
        flyBack();
    }

    private void flyBack() {
        System.out.println("Backup to match turkey flight.");
    }
}
