package client.impl;

import client.Waiter;
import collection.impl.DinerMenu;
import collection.impl.Menu;
import collection.impl.PancakeHouseMenu;
import domain.MenuItem;
import iterator.MenuIterator;

public class RestaurantWaiter implements Waiter {

    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public RestaurantWaiter(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    @Override
    public void printMenu() {
        MenuIterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
        MenuIterator dinerHouseIterator = dinerMenu.createIterator();

        System.out.println("MENU\n-----\nBREAKFAST");
        printMenu(pancakeHouseIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerHouseIterator);
    }

    @Override
    public boolean isItemVegetarian(String name) {
        MenuIterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
        MenuIterator dinerHouseIterator = dinerMenu.createIterator();

        boolean isPancakeHouseMenuItemVege = getIsVegetarian(name, pancakeHouseIterator);
        boolean isDinerMenuItemVege = getIsVegetarian(name, dinerHouseIterator);

        return (isPancakeHouseMenuItemVege || isDinerMenuItemVege);
    }

    private boolean getIsVegetarian(String name, MenuIterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            if (item.getName().equals(name)) {
                return item.isVegetarian();
            }
        }
        return false;
    }

    private void printMenu(MenuIterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waiter waiter = new RestaurantWaiter(pancakeHouseMenu, dinerMenu);
        waiter.printMenu();

        boolean isVegetarian = waiter.isItemVegetarian("hotdog");
        System.out.println(isVegetarian);
    }
}
