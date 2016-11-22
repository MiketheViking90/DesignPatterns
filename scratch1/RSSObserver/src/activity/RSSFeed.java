package activity;

import observer.impl.Email;
import observer.impl.Website;
import subject.impl.Blog;

public class RSSFeed {

    public static void main(String[] args) {

        Blog blog = new Blog();
        Website website = new Website(blog);
        Email email = new Email(blog);

        blog.addObserver(website);
        blog.addObserver(email);

        blog.setContent("Mohammad Ali", "Defeats Joe Frazier!");
    }

}
