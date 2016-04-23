package client.impl;

import java.util.Iterator;

import client.Waiter;
import collection.Menu;
import collection.impl.DinerMenu;
import collection.impl.PancakeHouseMenu;
import domain.MenuItem;

public class RestaurantWaiter implements Waiter {

    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public RestaurantWaiter(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    @Override
    public void printMenu() {
        Iterator<MenuItem> pancakeHouseIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerHouseIterator = dinerMenu.createIterator();

        System.out.println("MENU\n-----\nBREAKFAST");
        printMenu(pancakeHouseIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerHouseIterator);
    }

    @Override
    public boolean isItemVegetarian(String name) {
        Iterator<MenuItem> pancakeHouseIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerHouseIterator = dinerMenu.createIterator();

        boolean isPancakeHouseMenuItemVege = getIsVegetarian(name, pancakeHouseIterator);
        boolean isDinerMenuItemVege = getIsVegetarian(name, dinerHouseIterator);

        return (isPancakeHouseMenuItemVege || isDinerMenuItemVege);
    }

    private boolean getIsVegetarian(String name, Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            if (item.getName().equals(name)) {
                return item.isVegetarian();
            }
        }
        return false;
    }

    private void printMenu(Iterator<MenuItem> iterator) {
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
