package GroceryList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    // private ArrayList<String> groceryList = new ArrayList<>();
    private Map<String, Double> groceryList = new HashMap<>();

    void addItem(String item, Double cost) {
        if (!groceryList.containsKey(item)) {
            groceryList.put(item, cost);
        }
    }

    void removeItem(String item) {
        groceryList.remove(item);
    }

    boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    void displayList() {
        int idx = 1; // easier to read indexing
        for (Map.Entry<String, Double> item : groceryList.entrySet()) {
            System.out.println(idx + ". " + item.getKey() + ": " + item.getValue());
            idx++;
        }
    }

    double calculateTotalCost() {
        double total = 0.0;
        for (Map.Entry<String, Double> item : groceryList.entrySet()) {
            total += item.getValue();
        }
        return total;
    }

    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();

        groceryList.addItem("Apples", 5.99);
        groceryList.addItem("Milk", 1.95);
        groceryList.addItem("Bread", 3.00);

        System.out.println("Grocery List:");
        groceryList.displayList();

        System.out.printf("\nTotal Cost: %.2f", groceryList.calculateTotalCost());

        System.out.println("\nIs Milk in the grocery list? " + groceryList.checkItem("Milk"));

        System.out.println("\nRemoving Milk from the list...");
        groceryList.removeItem("Milk");

        System.out.println("\nUpdated Grocery List:");
        groceryList.displayList();
    }
}
