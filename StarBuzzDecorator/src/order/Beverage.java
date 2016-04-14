package order;

import java.util.List;

import lombok.Getter;

public abstract class Beverage {

    @Getter protected double cost;
    @Getter protected List<String> description;
    @Getter protected Size size;

    @Override
    public String toString() {
        return String.format("%1.2f\n%s\n%s",
                this.getCost(),
                this.getDescription(),
                size);
    }

}
