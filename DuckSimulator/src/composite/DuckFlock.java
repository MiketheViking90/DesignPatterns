package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import behaviors.Quackable;

public class DuckFlock implements Quackable {

    List<Quackable> flock;

    public DuckFlock() {
        flock = new ArrayList<>();
    }

    @Override
    public void quack() {
        Iterator<Quackable> flockIterator = flock.iterator();
        while(flockIterator.hasNext()) {
            Quackable flockComponent = flockIterator.next();
            flockComponent.quack();
        }
    }

    public void add(Quackable duck) {
        flock.add(duck);
    }

    public void add(Quackable... ducks) {
        for (Quackable duck : ducks) {
            flock.add(duck);
        }
    }
}
