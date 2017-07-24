package designpatterns.strategy.strategies;

public class FlyWithWings implements Flyable {

    @Override
    public void fly() {
        System.out.println("Flap flap flap");
    }

}
