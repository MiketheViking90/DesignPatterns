package observer;

public interface QuackObservable {

    public void registerObserver(QuackObserver obs);

    public void notifyObservers();

}
