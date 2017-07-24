package designpatterns.strategy.strategies;

public class Quack implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack quack");
    }
}
