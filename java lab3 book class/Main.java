import java.util.Scanner;

 class Book {
    String name, author;
    int price, numPages;

    Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        return "Book name: " + this.name + "\n" +
               "Author name: " + this.author + "\n" +
               "Price: " + this.price + "\n" +
               "Number of pages: " + this.numPages + "\n";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = in.nextInt();
        in.nextLine(); 

        Book[] books = new Book[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of book " + (i + 1) + ": ");
            String name = in.nextLine();
            System.out.print("Enter the author of book " + (i + 1) + ": ");
            String author = in.nextLine();
            System.out.print("Enter the price of book " + (i + 1) + ": ");
            int price = in.nextInt();
            System.out.print("Enter the number of pages in book " + (i + 1) + ": ");
            int numPages = in.nextInt();
            in.nextLine(); 

            books[i] = new Book(name, author, price, numPages);
            System.out.println(books[i]);
        }
        
        
    }
}