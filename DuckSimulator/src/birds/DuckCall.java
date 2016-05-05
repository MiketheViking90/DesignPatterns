package birds;

import observer.impl.DuckObservable;

public class DuckCall extends AbstractDuck {

    DuckObservable observable;

    @Override
    public void quack() {
        System.out.println("kwak");
    }

}
