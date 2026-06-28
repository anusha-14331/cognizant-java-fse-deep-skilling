package InventorySystem;
import java.util.HashMap;

class InventoryManagement {

    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }

    public void updateProduct(int id, int quantity, double price) {

        if (inventory.containsKey(id)) {

            Product product = inventory.get(id);

            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product Updated Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }
    }

    public void deleteProduct(int id) {

        if (inventory.containsKey(id)) {

            inventory.remove(id);

            System.out.println("Product Deleted Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }

    }

    public void displayProducts() {

        for (Product product : inventory.values()) {

            System.out.println(product);

        }

    }

}