import Players.Inventory;
import Players.Item;
import Players.User;

import java.util.ArrayList;

public class MudServer {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to MUD.");

        ArrayList<String> inv = new ArrayList<String>();

//        Generating and adding items to the inventory like this feels weird, but I think it's best practice?
        Inventory newInventory = new Inventory(inv);

        Item pickaxe = new Item("Pickaxe");

        inv.add(pickaxe.getName());

        User newUser = new User("Serrow", 1, newInventory.getInventory());

        System.out.println("User: " + newUser.getName());
        System.out.println("Level: " + newUser.getLevel());
        System.out.println("Inventory: " + newUser.getInventory());

//        for (int i = 0; i < inventory.size(); i++) {
//            System.out.println("Inventory Item " + i + ": " + (inventory.get(i)));
//        }



    }
}