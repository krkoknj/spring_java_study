package org.example.restaurant;

public class Customer {

    public Cook order(String name, Menu menu, Cooking cooking) {
        MenuItem menuItem = menu.choose(name);
        return cooking.makeCook(menuItem);
    }
}
