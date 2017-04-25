package zajecia1.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Application {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        insertExampleData(bookstore);
        Book[] books = bookstore.getBooks("Henryk Sienkiewicz");
        for(int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        };
    }

    public static void insertExampleData(Bookstore bookstore){
        Book book = new Book("Ogniem i mieczem", "Henryk Sienkiewicz","2001", "12335256");
        book.setSize(3);
        String[] ogniemIMieczem = new String[3];
        ogniemIMieczem[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        ogniemIMieczem[1] = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ";
        ogniemIMieczem[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";
        book.setContent(ogniemIMieczem);

        Book book2 = new Book("Quo Vadis", "Henryk Sienkiewicz", "2002", "873669634");
        String[] quoVadis = new String[3];
        quoVadis[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        quoVadis[1] = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
        quoVadis[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";
        book2.setContent(quoVadis);

        Book book3 = new Book("Dziady 4", "Adam Mickiewicz","2006","3567473");
        String[] dziady = new String[3];
        dziady[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        dziady[1] = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
        dziady[2] = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";
        book3.setContent(dziady);

        bookstore.add(book);
        bookstore.add(book2);
        bookstore.add(book3);

    }
}
