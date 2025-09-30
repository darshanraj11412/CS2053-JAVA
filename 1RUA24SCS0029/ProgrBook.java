class Book {
    public String title;
    public String author;
    public String isbn;
    public double price;

    // Constructor using 'this' keyword to initialize instance variables
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Price: $" + price);
    }
}

public class ProgrBook {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", 32.99);
        book1.display();
    }
}
