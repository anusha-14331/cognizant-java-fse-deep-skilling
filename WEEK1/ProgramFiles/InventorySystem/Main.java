package InventorySystem;
public class Main {

    public static void main(String[] args) {

        InventoryManagement inventory = new InventoryManagement();

        inventory.addProduct(new Product(101, "Laptop", 10, 55000));

        inventory.addProduct(new Product(102, "Mouse", 50, 500));

        inventory.updateProduct(101, 15, 53000);

        inventory.deleteProduct(102);

        System.out.println("\nAvailable Products\n");

        inventory.displayProducts();

    }

}