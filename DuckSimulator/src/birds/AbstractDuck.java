package birds;

import behaviors.Quackable;
import observer.QuackObserver;
import observer.impl.DuckObservable;

public abstract class AbstractDuck implements Quackable {

    DuckObservable observable;

    public AbstractDuck() {
        observable = new DuckObservable(this);
    }

    @Override
    public void registerObserver(QuackObserver obs) {
        System.out.println("register");
        observable.registerObserver(obs);
        System.out.println(observable.getObservers());
    }

    @Override
    public void notifyObservers() {
        System.out.println(observable.getObservers());
        observable.notifyObservers();
    }

}
