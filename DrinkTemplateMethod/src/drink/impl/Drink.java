package drink.impl;

public abstract class Drink {

    public final void prepareRecipe() {
        boilWater();
        prepareDrink();
        pourInCup();
        addCondiments();
    }
    protected abstract void pourInCup();

    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void prepareDrink() {
        System.out.println("Preparing drink");
    }
}
