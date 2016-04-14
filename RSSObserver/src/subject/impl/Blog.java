package subject.impl;

import java.util.List;
import java.util.Observable;

import lombok.Getter;

public class Blog extends Observable {

    @Getter private String title;
    @Getter private String body;
    private List<Observable> observers;

    public void contentsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setContent(String title, String body) {
        this.title = title;
        this.body = body;
        contentsChanged();
    }

    @Override
    public void notifyObservers() {

    }
}
