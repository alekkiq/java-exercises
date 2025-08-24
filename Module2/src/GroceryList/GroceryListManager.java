package GroceryList;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
        }
    }

    void removeItem(String item) {
        groceryList.remove(item);
    }

    void displayList() {
        int idx = 1; // easier to read indexing
        for (String s : groceryList) {
            System.out.println(idx + ". " + s);
            idx++;
        }
    }

    boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager groceryList = new GroceryListManager();

        groceryList.addItem("Apples");
        groceryList.addItem("Milk");
        groceryList.addItem("Bread");

        System.out.println("Grocery List:");
        groceryList.displayList();

        System.out.println("\nIs Milk in the grocery lit? " + groceryList.checkItem("Milk"));

        System.out.println("\nRemoving Milk from the list...");
        groceryList.removeItem("Milk");

        System.out.println("\nUpdated Grocery List:");
        groceryList.displayList();
    }
}
