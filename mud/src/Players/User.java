package Players;

import java.util.ArrayList;

public class User {
    private final String name;
    private final Integer level;

    public User(final String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }
}
