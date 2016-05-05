package simulator;

import behaviors.Quackable;
import composite.DuckFlock;
import decorator.QuackCounter;
import factory.AbstractDuckFactory;
import factory.impl.QuackCounterFactory;
import observer.QuackObserver;
import observer.impl.Quackologist;

public class DuckSimulator {

    private void simulate(AbstractDuckFactory quackCountFactory) {
        Quackable mallardDuck = quackCountFactory.createMallardDuck();
        Quackable redheadDuck = quackCountFactory.createRedheadDuck();
        Quackable duckCall = quackCountFactory.createDuckCall();
        Quackable rubberDuck = quackCountFactory.createRubberDuck();
        Quackable gooseDuck = quackCountFactory.createGooseDuck();

        DuckFlock flock = new DuckFlock();
        flock.add(mallardDuck, redheadDuck, duckCall, rubberDuck, gooseDuck);

        Quackable mallardDuck1 = quackCountFactory.createMallardDuck();
        Quackable mallardDuck2 = quackCountFactory.createMallardDuck();
        Quackable mallardDuck3 = quackCountFactory.createMallardDuck();
        Quackable mallardDuck4 = quackCountFactory.createMallardDuck();
        Quackable mallardDuck5 = quackCountFactory.createMallardDuck();

        DuckFlock mallardFlock = new DuckFlock();
        mallardFlock.add(mallardDuck1, mallardDuck2, mallardDuck3, mallardDuck4, mallardDuck5);

        System.out.println("Duck Simulator");
        System.out.println("--------------");
        simulate(flock);

        System.out.println("Mallard Simulator");
        System.out.println("--------------");
        simulate(mallardFlock);

        System.out.println(QuackCounter.getCount() + " quacks");

        System.out.println("\nWith Observer");
        System.out.println("--------------");

        QuackObserver quackologist = new Quackologist();
        mallardDuck1.registerObserver(quackologist);
        simulate(mallardDuck1);
    }

    private void simulate(Quackable duck) {
        duck.quack();
        System.out.println();
    }

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory quackCountFactory = new QuackCounterFactory();

        simulator.simulate(quackCountFactory );
    }
}
