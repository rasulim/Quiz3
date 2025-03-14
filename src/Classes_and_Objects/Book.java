package Classes_and_Objects;

public class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Kitabın adı: " + title);
        System.out.println("Müəllif: " + author);
        System.out.println("Nəşr ili: " + year);
        System.out.println();
    }
}
