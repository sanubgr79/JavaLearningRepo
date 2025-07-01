import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Book Manager ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Remove Book");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String book = scanner.nextLine();
                    manager.addBook(book);
                    break;
                case 2:
                    manager.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter book index to remove: ");
                    int index = scanner.nextInt() - 1; // Convert to zero-based index
                    manager.removeBook(index);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

}


