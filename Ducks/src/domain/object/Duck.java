package domain.object;

import lombok.Getter;

public abstract class Duck {

    private static final String SWIM_FORMAT = "%s is swimming.";
    private static final String EAT_FORMAT = "%s is eating.";

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
