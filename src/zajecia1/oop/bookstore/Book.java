package zajecia1.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Book {
    private String author;
    private String releaseDate;
    private int size;
    private String ISBN;
    private String [] content;
    private String title;
    private String description;

    public Book (String title, String author, String releaseDate, String ISBN){
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.ISBN = ISBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getSize() {
        return size;
    }

    public String getISBN() {
        return ISBN;
    }

    public String[] getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
