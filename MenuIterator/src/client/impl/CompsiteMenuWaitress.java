package client.impl;

import client.Waiter;
import composite.MenuComponent;
import composite.impl.Menu;
import domain.MenuItem;

public class CompsiteMenuWaitress implements Waiter {

    private MenuComponent menus;

    public CompsiteMenuWaitress(MenuComponent menus) {
        this.menus = menus;
    }

    @Override
    public void printMenu() {
        System.out.println(menus.toString());
    }

    @Override
    public boolean isItemVegetarian(String name) {
        return false;
    }

    public static void main(String[] args) {
        MenuComponent menus = buildMenu();
        Waiter waiter = new CompsiteMenuWaitress(menus);

        waiter.printMenu();
    }

    private static MenuComponent buildMenu() {
        MenuComponent menus = new Menu("Resturant menu", "Menu for all the resturant offers.");

        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE", "Pancake House Menu.");
        MenuComponent dinerMenu = new Menu("DINER", "Diner Menu.");
        MenuComponent cafeMenu = buildCafeMenu();
        MenuComponent desertMenu = buildDesertMenu();
        cafeMenu.add(desertMenu);

        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

        return menus;
    }

    private static MenuComponent buildCafeMenu() {
        MenuComponent cafeMenu = new Menu("CAFE", "Cafe Menu.");

        MenuComponent vegBurger = new MenuItem("Veggie Burger",
                "Veggie burger with lettuce, tomato, and fries.",
                true,
                5.69);

        MenuComponent burrito = new MenuItem("Burrito",
                "Burrito with carne asada, guacamole, and salsa.",
                false,
                5.50);

        cafeMenu.add(vegBurger);
        cafeMenu.add(burrito);

        return cafeMenu;
    }

    private static MenuComponent buildDesertMenu() {
        MenuComponent desertMenu = new Menu("DESERT", "Desert Menu.");


        MenuComponent chocolateCake = new MenuItem("Chocolate Cake",
                "Yummy chocolate cake with candles and whipped cream.",
                true,
                5.00);
        desertMenu.add(chocolateCake);

        return desertMenu;
    }

}
