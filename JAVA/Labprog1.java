class Book {
    String title;
    String author;
    double price;

    Book() {
        this("Unknown Title", "Unknown Author", 0.0);     }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println(" Title: " + this.title);
        System.out.println(" Author: " + this.author);
        System.out.println(" Price: $" + this.price);
    }
}

public class Labprog1 {
    public static void main(String[] args) {
        Book book1 = new Book();  
        Book book2 = new Book("1984", "George Orwell", 399.99);
        Book book3 = new Book("The Alchemist", "Paulo Coelho", 299.50);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
