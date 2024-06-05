import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: $" + price;
    }
}

public class InventoryManagementSystem {
    private ArrayList<Product> products;

    public InventoryManagementSystem() {
        products = new ArrayList<>();
    }


    // Add a product to inventory
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove a product from inventory
    public void removeProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
    }

    // Update the quantity of a product in inventory
    public void updateProductQuantity(int id, int quantity) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setQuantity(quantity);
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nInventory Management System Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    ims.addProduct(new Product(id, name, quantity, price));
                    break;
                case 2:
                    System.out.print("Enter product ID to remove: ");
                    int removeId = scanner.nextInt();
                    ims.removeProduct(removeId);
                    break;
                case 3:
                    System.out.print("Enter product ID to update quantity: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    ims.updateProductQuantity(updateId, newQuantity);
                    break;
                case 4:
                    ims.displayInventory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}
