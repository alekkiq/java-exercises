package GroceryList;

public class GroceryItem {
    double cost;
    String category;
    int quantity;

    public GroceryItem(double cost, String category, int quantity) {
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }

    public double getCost() {
        return this.cost;
    }

    public String getCategory() {
        return this.category;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
}
