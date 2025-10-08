import module_8_2.ShoppingCart;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();

        // happy path
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);

        assertEquals(2, cart.getItemCount());

        // edge cases - none of the below should be added
        cart.addItem("", 10);
        cart.addItem(null, 1);
        cart.addItem("Bread", -20);
        cart.addItem("Bread", Integer.MAX_VALUE + 1);

        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();

        // happy path
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.removeItem("Apple");

        // edge cases - nothing removed
        cart.removeItem(null);
        cart.removeItem("");
        cart.removeItem("Bread");

        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();

        // happy path
        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        cart.addItem("Orange", 0.75);

        assertEquals(2.25, cart.calculateTotal(), 0.01);
    }
}
