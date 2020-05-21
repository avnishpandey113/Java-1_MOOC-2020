
public class Item {

    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (compared instanceof Item) {
            Item itemCompared = (Item) compared;
            if (this.identifier.equals(itemCompared.identifier)) {
                return true;
            }
        }

        return false;
    }
 
    
    
}
