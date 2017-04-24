package zajecia1.oop.bookstore;

import java.util.Arrays;

/**
 * Created by RENT on 2017-04-24.
 */
public class Book {
    public String title;
    public String description;
    public String releaseDate;
    public int size;
    public String ISBN;
    public String[] content;
    public String author;

    public Book(String title, String author, String releaseDate, String ISBN){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.ISBN = ISBN;
        this.description = "To be updated.";
    }

    public void printDescription() {
        System.out.println(description);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", size=" + size +
                ", ISBN='" + ISBN + '\'' +
                ", content=" + Arrays.toString(content) +
                ", author='" + author + '\'' +
                '}';
    }
}
