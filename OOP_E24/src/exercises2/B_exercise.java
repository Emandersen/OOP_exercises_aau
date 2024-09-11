/*
Write a class to represent a book. A book has a title, an
author, a publication year, a number of pages, an optional ISBN number,
and an optional language. Write appropriate constructors for each “type”
of book. Write a method that given a reading speed (pages/min) computes
how long it will take to read the entire book.
 */
public class B_exercise {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 218);

        Book book2 = new Book("Sapiens", "Yuval Noah Harari", 2011, 498, "978-0062316110", "English");

        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor());
        System.out.println("Publication Year: " + book1.getYear());
        System.out.println("Pages: " + book1.getPages());
        System.out.println("ISBN: " + book1.getISBN());
        System.out.println("Language: " + book1.getLangauge());

        System.out.println("\nBook 2: " + book2.getTitle() + " by " + book2.getAuthor());
        System.out.println("Publication Year: " + book2.getYear());
        System.out.println("Pages: " + book2.getPages());
        System.out.println("ISBN: " + book2.getISBN());
        System.out.println("Language: " + book2.getLangauge());

        // Calculate and print reading time for both books at a speed of 1 page per minute
        int readingSpeed = 1; // 1 page per minute
        System.out.println("\nReading time for Book 1: " + book1.getReadingTimeMinutes(readingSpeed) + " minutes");
        System.out.println("Reading time for Book 2: " + book2.getReadingTimeMinutes(readingSpeed) + " minutes");
    }
}

class Book {
    // Instance variables
    private String title;
    private String author;
    private int year;
    private int pages;
    private String ISBN;
    private String Langauge;

    // Constructors
    Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.ISBN = null;
        Langauge = null;
    }

    Book(String title, String author, int year, int pages, String ISBN, String Langauge) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.ISBN = ISBN;
        this.Langauge = Langauge;
    }

    // Getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String getISBN() {
        if (ISBN != null) {
            return ISBN;
        } else {
            System.out.println("No ISBN found");
        }
        return "";
    }

    public String getLangauge() {
        if (Langauge != null) {
            return Langauge;
        } else {
            System.out.println("No Langauge found");
        }
        return "";
    }

    public int getReadingTimeMinutes(int speed) {
        if (speed > 0) {
            return pages / speed;
        } else {
            System.out.println("Invalid speed");
            return 0;
        }
    }

    // setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setLangauge(String Langauge) {
        this.Langauge = Langauge;
    }





}