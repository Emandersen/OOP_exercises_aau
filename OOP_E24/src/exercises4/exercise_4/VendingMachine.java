package exercise_4;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<Integer, Product> products;

    public VendingMachine() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.get_slot(), product);
    }

    public Product getProduct(int slot) {
        return products.get(slot);
    }

    public void buyProduct(int slot) {
        Product product = products.get(slot);
        if (product != null && product.get_stock() != 0) {
            product.buy();
            System.out.println("You bought a " + product.get_name());
        } else {
            System.out.println("Product is sold out or does not exist.");
        }
    }
}