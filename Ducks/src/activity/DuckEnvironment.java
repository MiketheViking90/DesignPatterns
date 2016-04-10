package activity;

import domain.object.Duck;
import domain.object.impl.Mallard;
import domain.object.impl.RubberDuck;

public class DuckEnvironment {

    public static void main(String[] args) {
        simulateDucks();
    }

    public static void simulateDucks() {

        Duck mallard = new Mallard("Mallard");
        mallard.fly();
        mallard.swim();

        Duck duckie = new RubberDuck("Duckie");
        duckie.fly();
    }
}
