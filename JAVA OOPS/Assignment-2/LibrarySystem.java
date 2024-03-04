import java.util.Scanner;

abstract class LibraryResource {
    private String title;
    private String author;

    abstract void displayDetails();

    LibraryResource() {

    }

    LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;

    }

    void set_title(String title) {
        this.title = title;
    }

    void set_author(String author) {
        this.author = author;
    }

    String get_title() {
        return title;
    }

    String get_author() {
        return author;
    }

}

class Book extends LibraryResource {
    private int pageCount;

    Book(int pageCount, String title, String author) {
        super(title, author);

        this.pageCount = pageCount;

    }

    void set_pageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    int get_pageCount() {
        return pageCount;
    }

    @Override
    void displayDetails() {
        System.out.println("The title of the book is " + get_title() + " and the name of the author is " + get_author()
                + " and the pagecount is " + get_pageCount());

    }
}

class Magazine extends LibraryResource {
    int issueDate;

    Magazine(int issueDate, String title, String author) {
        super(title, author);
        this.issueDate = issueDate;

    }

    void set_issueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    int get_issueDate() {
        return issueDate;
    }

    @Override
    void displayDetails() {
        System.out.println("The title of the book is " + get_title() + " and the name of the author is " + get_author()
                + " the issuedate of the book  is " + issueDate);

    }

}

class DVD extends LibraryResource {
    int duration;

    DVD(int duration, String title, String author) {
        super(title, author);
        this.duration = duration;

    }

    void set_duration(int duration) {
        this.duration = duration;
    }

    int get_duration() {
        return duration;
    }

    @Override
    void displayDetails() {
        System.out.println("The title of the book is " + get_title() + " and the name of the author is " + get_author()
                + " the  duration of the DVD is " + get_duration());
    }

}

public class LibrarySystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title of the book: ");
        String title = sc.next();
        System.out.print("Enter author of the book: ");
        String author = sc.next();
        System.out.print("Enter pagecount: ");
        int page = sc.nextInt();
        System.out.print("Enter issuedate: ");
        int date = sc.nextInt();
        System.out.print("Enter the duration: ");
        int duration = sc.nextInt();
        Book obj1 = new Book(page, title, author);
        obj1.displayDetails();
        Magazine obj2 = new Magazine(date, title, author);
        obj2.displayDetails();
        DVD obj3 = new DVD(duration, title, author);
        obj3.displayDetails();

    }

}
