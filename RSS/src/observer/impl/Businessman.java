package observer.impl;

import observer.Displayable;
import observer.Observer;
import subject.Subject;

public class Businessman implements Observer, Displayable {

    private Subject subscription;

    public Businessman(Subject sub) {
        this.subscription = sub;
    }

    @Override
    public void update(String content) {
    }

    @Override
    public void display() {
    }
}
