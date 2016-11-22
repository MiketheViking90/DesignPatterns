package birds;

public class MallardDuck extends AbstractDuck {

    @Override
    public void quack() {
        System.out.println("quack");
        notifyObservers();
    }

}
