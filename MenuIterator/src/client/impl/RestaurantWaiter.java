package client.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import client.Waiter;
import collection.Menu;
import collection.impl.CafeMenu;
import collection.impl.DinerMenu;
import collection.impl.PancakeHouseMenu;
import domain.MenuItem;

public class RestaurantWaiter implements Waiter {

    private List<Menu> menus;

    public RestaurantWaiter(List<Menu> menus) {
        this.menus = menus;
    }

    @Override
    public void printMenu() {
        Iterator<Menu> menusIterator = menus.iterator();

        printMenus(menusIterator);
    }

    @Override
    public boolean isItemVegetarian(String name) {
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            boolean isVege = getIsVegetarian(name, menuIterator.next());
            if (isVege) {
                return true;
            }
        }
        return false;
    }

    private boolean getIsVegetarian(String name, Menu menu) {
        Iterator<MenuItem> iterator = menu.createIterator();

        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            if (item.getName().equals(name)) {
                return item.isVegetarian();
            }
        }
        return false;
    }

    private void printMenus(Iterator<Menu> iterator) {
        while (iterator.hasNext()) {
            printMenu(iterator.next());
        }
    }
    private void printMenu(Menu menu) {
        System.out.println("MENU " + menu.getName());
        System.out.println("--------");
        Iterator<MenuItem> iterator = menu.createIterator();
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println(item);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waiter waiter = new RestaurantWaiter(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));
        waiter.printMenu();

        boolean isVegetarian = waiter.isItemVegetarian("Veggie Burrger");
        System.out.println(isVegetarian);
    }
}
