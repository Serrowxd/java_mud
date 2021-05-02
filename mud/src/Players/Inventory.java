package Players;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<String> inventory = new ArrayList<String>();

    public Inventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }
}
