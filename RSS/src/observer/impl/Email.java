package observer.impl;

import java.util.Observable;
import java.util.Observer;

import observer.Displayable;
import subject.impl.Blog;

public class Email implements Observer, Displayable {

    private static final String DISPLAY_FORMAT = "%s\n\t%s";

    private Observable observable;
    private String title;
    private String body;

    public Email(Observable observable) {
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
        String msg = String.format(DISPLAY_FORMAT,
                title,
                body);
        System.out.println(msg);

    }
}
