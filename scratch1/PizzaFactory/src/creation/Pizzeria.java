package creation;

import domain.Pizza;

public abstract class Pizzeria {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        Pizza preparedPizza = prepPizza(pizza);

        return preparedPizza;
    }

    protected abstract Pizza createPizza(String type);

    private Pizza prepPizza(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
