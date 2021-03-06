package Players;

import java.util.ArrayList;

public class User {
    private final String name;
    private Integer level;
    private ArrayList<String> inventory;

    public User(final String name, Integer level, ArrayList<String> inventory) {
        this.name = name;
        this.level = level;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }
}
