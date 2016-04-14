package order;

import java.util.List;

import lombok.Getter;

public abstract class Beverage {

    @Getter protected double cost;
    @Getter protected List<String> description;
    @Getter protected Size size;

}
