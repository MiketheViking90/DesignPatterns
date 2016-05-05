package observer.impl;

import observer.QuackObservable;
import observer.QuackObserver;

public class Quackologist implements QuackObserver {

    private static final String DISPLAY_FORMAT = "Quackologist: %s just quacked.";

    @Override
    public void update(QuackObservable duck) {
        String msg = String.format(DISPLAY_FORMAT, duck);
        System.out.println(msg);
    }

}
