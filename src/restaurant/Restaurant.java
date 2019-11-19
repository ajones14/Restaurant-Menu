package restaurant;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem chickenSoup = new MenuItem(8.00, "Chicken soup", "Lunch");
        MenuItem cheeseburger = new MenuItem(12.00, "Cheeseburger with fries", "Dinner");
        MenuItem chocolateCake = new MenuItem(6.00, "Chocolate Cake", "Dessert");
        MenuItem coke = new MenuItem(2.00, "Coca Cola", "Drinks");

        Menu menu = new Menu();

        menu.addItem(chickenSoup);
        menu.addItem(cheeseburger);
        menu.addItem(chocolateCake);
        menu.addItem(coke);

        System.out.println("Print entire menu");
        System.out.println(menu.printMenu());
        System.out.println("Print single item");
        System.out.println(menu.printItem(cheeseburger));

        menu.removeItem(chocolateCake);
        System.out.println("Reprint menu");
        System.out.println(menu.printMenu());

    }

}
