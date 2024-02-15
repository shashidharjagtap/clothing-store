// ClothingItem.java
public class ClothingItem {
    private String name;
    private String category;
    private double price;

    // Constructors, getters, and setters
import java.util.List;

public class ClothingStore {
    private List<ClothingItem> inventory;

    // Methods for managing inventory (add, remove, update, list items, etc.)
  }	

    public ClothingItem(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

