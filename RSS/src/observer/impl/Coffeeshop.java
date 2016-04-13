package observer.impl;

import observer.Displayable;
import observer.Observer;
import subject.Subject;

public class Coffeeshop implements Observer, Displayable {

    private Subject subscription;

    public Coffeeshop (Subject sub) {
        this.subscription = sub;
    }

    @Override
    public void update(String content) {
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
    }
}
