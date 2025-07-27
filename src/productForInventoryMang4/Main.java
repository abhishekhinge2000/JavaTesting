package productForInventoryMang4;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of InventoryManager
        InventoryManager inventoryManager = new InventoryManager();

        // Create six some Product objects

        Product p1 = new Product(101, "Laptop", 999.99);
        Product p2 = new Product(102, "Mouse", 25.50);
        Product p3 = new Product(103, "Keyboard", 45.99);
        Product p4 = new Product(104, "Monitor", 150.75);
        Product p5 = new Product(105, "USB Cable", 10.99);
        Product p6 = new Product(106, "Webcam", 85.00);



        // Add all the products to the inventory call addOrUpdateProduct method to add and update

        inventoryManager.addOrUpdateProduct(p1, 5);
        inventoryManager.addOrUpdateProduct(p2, 10);
        inventoryManager.addOrUpdateProduct(p3, 7);
        inventoryManager.addOrUpdateProduct(p4, 3);
        inventoryManager.addOrUpdateProduct(p5, 20);
        inventoryManager.addOrUpdateProduct(p6, 4);



        // Display inventory before details
        System.out.println("Inventory Details:");
        displayInventoryDetails(inventoryManager);

        // call the remove method to remove a product from the inventory

        inventoryManager.removeProduct(p3);


        // Display inventory details after removal
        System.out.println("Inventory Details after removal:");
        displayInventoryDetails(inventoryManager);

        // Retrieve a product by ID
        Product foundProduct = inventoryManager.getProductById(102);
        System.out.println("Product found: " + (foundProduct != null ? foundProduct.getName() : "Not found"));



        //Size of inventory
        System.out.println("Inventory Size: " + inventoryManager.getInventorySize());
    }

    // Method to display inventory details
    private static void displayInventoryDetails(InventoryManager inventoryManager) {
        Map<Product, Integer> inventory = inventoryManager.getInventory();
        for (Map.Entry<Product, Integer> entry : inventory.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Product ID: " + product.getProductId() +
                    ", Name: " + product.getName() +
                    ", Price: " + product.getPrice() +
                    ", Quantity: " + quantity);
        }
    }


}

