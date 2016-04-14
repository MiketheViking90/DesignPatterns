package observer.impl;

import java.util.Observable;
import java.util.Observer;

import observer.Displayable;
import subject.impl.Blog;

public class Website implements Observer, Displayable {

    private Observable observable;
    private String title;
    private String body;

    public Website(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Blog) {
            Blog blog = (Blog) o;

            this.title = blog.getTitle();
            this.body = blog.getBody();
            display();
        }
    }

    @Override
    public void display() {
        String msg = title.toUpperCase() + " " + body;
        System.out.println(msg);
    }
}
