package creation;

import domain.Pizza;
import domain.impl.ChicagoPepperoniPizza;
import domain.impl.NYCheesePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        if (type.equals("Cheese")) {
            return new NYCheesePizza();
        } else if (type.equals("Pepperoni")) {
            return new ChicagoPepperoniPizza();
        } else  {
            throw new IllegalArgumentException(String.format("No %s pizzas.", type));
        }
    }
}
