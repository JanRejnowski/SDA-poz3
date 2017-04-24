package zajecia1.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Bookstore {
    public Book[] books;
    public int size;

    public Bookstore(){
        this.books = new Book[100];
        this.size = 0;
    }

    public boolean add(Book book){
        boolean valueToReturn = false;
        if(size < 100){
            books[size] = book;
            size++;
            valueToReturn = true;
        }
        return valueToReturn;
    }

    public void showBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

//    public int getNumberOfBooks(String author){
//        int index = 0;
//        for(int i = 0; i < this.numberof)
//    }
//
//    public Book[] getBooks(String author){
//
//    }
//
//    public Book getBook(String ISBN) {
//
//    }

}
