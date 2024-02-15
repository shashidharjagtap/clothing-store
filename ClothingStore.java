// ClothingStore.java
import java.util.ArrayList;
import java.util.List;

public class ClothingStore {
    private List<ClothingItem> inventory;

    public ClothingStore() {
        this.inventory = new ArrayList<>();
    }

    // Methods for managing inventory (add, remove, update, list items, etc.)
    public void addItem(ClothingItem item) {
        inventory.add(item);
    }

    public void removeItem(ClothingItem item) {
        inventory.remove(item);
    }

    public List<ClothingItem> listItems() {
        return inventory;
    }
}

