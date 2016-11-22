package subject;

import observer.Observer;

public interface Subject {

    public void register(Observer obs);
    public void unregister(Observer obs);
    public void update();

}
