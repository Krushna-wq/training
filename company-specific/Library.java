class Book {
    String title;
    String author;
    int year;
    double price;
    boolean available;

    Book(String title, String author, int year, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.available = available;
    }

    void displayDetails() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Year       : " + year);
        System.out.println("Price      : " + price);
        System.out.println("Available  : " + available);
        System.out.println();
    }
}

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("TS Programming", "James Gosling", 2020, 500, true);
        Book book2 = new Book("Data Science", "Mark Allen", 2022, 700, false);
        Book book3 = new Book("Operating Systems", "Galvin", 2021, 600, true);

        Book[] books = {book1, book2, book3};

        System.out.println("All Books Details:");
        for (Book b : books) {
            b.displayDetails();
        }

        Book maxBook = books[0];

        for (int i = 1; i < books.length; i++) {
            if (books[i].price > maxBook.price) {
                maxBook = books[i];
            }
        }

        System.out.println("Maximum Price:");
        maxBook.displayDetails();

        System.out.println("Available Books:");
        for (Book b : books) {
            if (b.available) {
                b.displayDetails();
            }
        }
    }
}