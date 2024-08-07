import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nInventory Management System:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    Product product = new Product(id, name, quantity, price);
                    inventoryManager.addProduct(product);
                    break;
                case 2:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Product Name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int updateQuantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double updatePrice = scanner.nextDouble();
                    Product updateProduct = new Product(updateId, updateName, updateQuantity, updatePrice);
                    inventoryManager.updateProduct(updateProduct);
                    break;
                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    int deleteId = scanner.nextInt();
                    inventoryManager.deleteProduct(deleteId);
                    break;
                case 4:
                    inventoryManager.displayProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
