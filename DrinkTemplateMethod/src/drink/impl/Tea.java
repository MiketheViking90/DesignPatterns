package drink.impl;

public class Tea extends Drink {

    @Override
    protected void prepareDrink() {
        System.out.println("Steeping tea bag");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

}
