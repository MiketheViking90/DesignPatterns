package drink.impl;

public abstract class Drink {

    public final void prepareRecipe() {
        boilWater();
        prepareDrink();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    protected abstract void prepareDrink();
    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("Boiling water");
    }


    protected void pourInCup() {
        System.out.println("Pouring in cup");
    }

    protected boolean customerWantsCondiments() {
        return true;
    }
}
