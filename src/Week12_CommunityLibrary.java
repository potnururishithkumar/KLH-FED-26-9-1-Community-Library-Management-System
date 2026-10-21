import java.util.ArrayList;
import java.util.List;

/** Week 12 release: a runnable Community Library Management System. */
public class  Week12_CommunityLibrary {
    private static class Book {
        String id;
        String title;
        String borrower;

        Book(String id, String title) { this.id = id; this.title = title; }
        boolean isAvailable() { return borrower == null; }
    }

    private final List<Book> books = new ArrayList<>();

    private void addBook(String id, String title) { books.add(new Book(id, title)); }

    private boolean issueBook(String id, String member) {
        Book book = findBook(id);
        if (book == null || !book.isAvailable()) return false;
        book.borrower = member;
        return true;
    }

    private boolean returnBook(String id) {
        Book book = findBook(id);
        if (book == null || book.isAvailable()) return false;
        book.borrower = null;
        return true;
    }

    private Book findBook(String id) {
        for (Book book : books) if (book.id.equalsIgnoreCase(id)) return book;
        return null;
    }

    private void printReport() {
        int issued = 0;
        System.out.println("COMMUNITY LIBRARY - FINAL RELEASE");
        System.out.println("ID     Title                         Status");
        for (Book book : books) {
            String status = book.isAvailable() ? "Available" : "Issued to " + book.borrower;
            if (!book.isAvailable()) issued++;
            System.out.printf("%-6s %-29s %s%n", book.id, book.title, status);
        }
        System.out.printf("Catalogue: %d | Issued: %d | Available: %d%n",
                books.size(), issued, books.size() - issued);
    }

    public static void main(String[] args) {
        Week12_CommunityLibrary library = new Week12_CommunityLibrary();
        library.addBook("B101", "Java Foundations");
        library.addBook("B102", "Data Structures");
        library.addBook("B103", "Clean Code Basics");
        System.out.println("Issue B101 to Asha: " + library.issueBook("B101", "Asha"));
        System.out.println("Issue B101 again: " + library.issueBook("B101", "Ravi"));
        System.out.println("Return B101: " + library.returnBook("B101"));
        System.out.println("Issue B103 to Ravi: " + library.issueBook("B103", "Ravi"));
        library.printReport();
    }
}