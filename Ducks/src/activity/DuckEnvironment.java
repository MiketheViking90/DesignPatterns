package activity;

import domain.object.impl.Mallard;

public class DuckEnvironment {

    public static void main(String[] args) {
        DucksUnite();
    }

    public static void DucksUnite() {

        Mallard mallard = new Mallard("Mallard");
        mallard.fly();
    }
}
