import java.util.Scanner;

public class EcommerceSearchSystem {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Shoes", "Footwear"),
            new Product(4, "T-shirt", "Apparel"),
            new Product(5, "Coffee Maker", "Kitchen")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String productName = scanner.nextLine();

        System.out.println("Linear Search:");
        int linearSearchResult = SearchAlgorithms.linearSearch(products, productName);
        if (linearSearchResult != -1) {
            System.out.println("Product found: " + products[linearSearchResult]);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nBinary Search:");
        int binarySearchResult = SearchAlgorithms.binarySearch(products, productName);
        if (binarySearchResult != -1) {
            System.out.println("Product found: " + products[binarySearchResult]);
        } else {
            System.out.println("Product not found.");
        }

        scanner.close();
    }
}
