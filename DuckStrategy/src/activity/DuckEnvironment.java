package activity;

import domain.behavior.FlyBehavior;
import domain.behavior.impl.Flightless;
import domain.behavior.impl.FlyWithWings;
import domain.object.Duck;
import domain.object.impl.Mallard;
import domain.object.impl.RubberDuck;

public class DuckEnvironment {

    public static void main(String[] args) {
        simulateDucks();
    }

    public static void simulateDucks() {

        FlyBehavior flap = new FlyWithWings();
        FlyBehavior flightless = new Flightless();

        Duck mallard = new Mallard("Mallard");
        mallard.fly();
        mallard.swim();
        mallard.setFlyBehavior(flightless);
        mallard.fly();

        Duck duckie = new RubberDuck("Duckie");
        duckie.fly();
        duckie.swim();
    }
}
