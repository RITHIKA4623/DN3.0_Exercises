import java.util.Scanner;

public class OrderSortingSystem {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.20),
            new Order(4, "David", 50.10),
            new Order(5, "Eve", 200.45)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            SortAlgorithms.bubbleSort(orders);
        } else if (choice == 2) {
            SortAlgorithms.quickSort(orders, 0, orders.length - 1);
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        System.out.println("Sorted Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        scanner.close();
    }
}
