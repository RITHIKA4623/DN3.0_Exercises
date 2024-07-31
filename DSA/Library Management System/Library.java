import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Linear search to find a book by title
    public Book linearSearch(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary search to find a book by title (assuming the list is sorted)
    public Book binarySearch(String title) {
        Arrays.sort(books, 0, count, Comparator.comparing(Book::getTitle));
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Traverse the list and print books
    public void traverseBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        Library library = new Library(10);
        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(3, "1984", "George Orwell"));

        System.out.println("All Books:");
        library.traverseBooks();

        System.out.println("\nLinear Search for '1984':");
        Book foundBook = library.linearSearch("1984");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nBinary Search for 'The Great Gatsby':");
        foundBook = library.binarySearch("The Great Gatsby");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
