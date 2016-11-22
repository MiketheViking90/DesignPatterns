package domain.object;

import domain.behavior.FlyBehavior;
import lombok.Getter;
import lombok.Setter;

public abstract class Duck {

    private static final String SWIM_FORMAT = "%s is swimming.";
    private static final String EAT_FORMAT = "%s is eating.";

    @Setter protected FlyBehavior flyBehavior;

    @Getter
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public void swim() {
        String swimString = String.format(SWIM_FORMAT, name);
        System.out.println(swimString);
    }

    public void eat() {
        String eatString = String.format(EAT_FORMAT, name);
        System.out.println(eatString);
    }

    public abstract void fly();
}
