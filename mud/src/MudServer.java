import Players.User;

import java.util.ArrayList;

public class MudServer {
    public static void main(String[] args) {
        System.out.println("Hello, I'm a Java Program");

        User newUser = new User("Serrow", 1);
        System.out.println("User: " + newUser.getName());

        ArrayList<String> inventory = new ArrayList<String>();

        inventory.add("Item");
        inventory.add("Item");
        inventory.add("Item");
        inventory.add("Item");

        System.out.println(inventory);

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("Inventory Item " + i + ": " + (inventory.get(i)));
        }


    }
}