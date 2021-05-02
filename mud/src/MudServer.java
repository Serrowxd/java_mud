import Players.User;

import java.util.ArrayList;

public class MudServer {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to MUD.");

        ArrayList<String> inv = new ArrayList<String>();

        inv.add("Item");
        inv.add("Item");
        inv.add("Item");
        inv.add("Item");

        User newUser = new User("Serrow", 1, inv);
        System.out.println("User: " + newUser.getName());
        System.out.println("Level: " + newUser.getLevel());
        System.out.println("Inventory: " + newUser.getInventory());

//        for (int i = 0; i < inventory.size(); i++) {
//            System.out.println("Inventory Item " + i + ": " + (inventory.get(i)));
//        }


    }
}