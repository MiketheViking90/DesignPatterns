package subject;

import observer.Observer;

public interface Subject {

    public void register(Observer observer);
    public void unregister(Observer observer);
    public void update();

}
