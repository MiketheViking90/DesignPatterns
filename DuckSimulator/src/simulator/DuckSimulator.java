package simulator;

import behaviors.Quackable;
import decorator.QuackCounter;
import factory.AbstractDuckFactory;
import factory.impl.DuckFactory;
import factory.impl.QuackCounterFactory;

public class DuckSimulator {

    private void simulate() {
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory quackCountFactory = new QuackCounterFactory();

        Quackable mallardDuck = quackCountFactory.createMallardDuck();
        Quackable redheadDuck = quackCountFactory.createRedheadDuck();
        Quackable duckCall = quackCountFactory.createDuckCall();
        Quackable rubberDuck = quackCountFactory.createRubberDuck();
        Quackable gooseDuck = quackCountFactory.createGooseDuck();

        System.out.println("Duck Simulator");
        System.out.println("--------------");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println(QuackCounter.getCount() + " quacks");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
}
