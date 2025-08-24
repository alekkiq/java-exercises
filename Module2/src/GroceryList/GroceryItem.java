package GroceryList;

public class GroceryItem {
    double cost;
    String category;

    public GroceryItem(double cost, String category) {
        this.cost = cost;
        this.category = category;
    }

    public double getCost() {
        return this.cost;
    }

    public String getCategory() {
        return this.category;
    }
}
