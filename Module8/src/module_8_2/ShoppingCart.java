package module_8_2;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void addItem(String name, double cost) {
        if (name == null || name.isEmpty()) return;
        if (cost < 0 || cost > Integer.MAX_VALUE) return;

        this.items.put(name, cost);
    }

    public void removeItem(String name) {
        this.items.remove(name);
    }

    public double calculateTotal() {
        double total = 0;

        for (double cost : this.items.values())
            total += cost;

        System.out.println(total);
        return total;
    }

    public int getItemCount() {
        return this.items.size();
    }
}
