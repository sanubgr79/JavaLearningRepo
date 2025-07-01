import java.util.ArrayList;

//Main class to manipulate book objects
public class BookManager {
    private ArrayList<String> books = new ArrayList<>();

    // Add a book
    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    // View all books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books in the collection:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    // Remove a book by index
    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            System.out.println("Book removed: " + books.remove(index));
        } else {
            System.out.println("Invalid index. No book removed.");
        }
    }
}
