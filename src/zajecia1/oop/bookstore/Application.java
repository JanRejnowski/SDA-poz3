package zajecia1.oop.bookstore;

/**
 * Created by RENT on 2017-04-24.
 */
public class Application {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        insertExampleData(bookstore);
        System.out.println(bookstore.books[0].toString());

    }

    public static void insertExampleData(Bookstore bookstore){
        Book book = new Book("Ogniem i mieczem","Henryk Sienkiewicz","2001","123355" );
        book.author = "Henryk Sienkiewicz";
        book.title = "Ogniem i mieczem";
        book.ISBN = "1234567890";
        book.releaseDate = "2001";
        book.size = 3;
        String[] ogniemIMieczem = new String[3];
        ogniemIMieczem[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean purus nisi, dignissim id condimentum sit amet, fermentum eu augue.";
        ogniemIMieczem[1] = "Sed ornare aliquet sem vel vehicula. Nunc eget vehicula libero, nec luctus metus.";
        ogniemIMieczem[2] = "Nulla finibus elementum sem, ut tristique ante varius a.";
        book.content = ogniemIMieczem;

        Book book2 = new Book("Quo Vadis", "Henryk Sienkiewicz", "2002","1324325");
        String[] quoVadis = new String[3];
        quoVadis[0] = "Fusce tincidunt massa at sem malesuada accumsan.";
        quoVadis[1] = "In nec urna vitae diam vulputate elementum. Nunc lobortis commodo pellentesque.";
        quoVadis[2] = "Donec eleifend non orci in finibus. Vestibulum et metus leo. Sed ex orci, accumsan mattis mi sit amet, fringilla tincidunt augue.";
        book2.content = quoVadis;

        Book book3 = new Book("Dziady 4", "Adam Mickiewicz", "2002", "87321757");
        String[] dziady = new String[3];
        dziady[0] = "kek";
        dziady[1] = "lel";
        dziady[2] = "uaaaa";
        book3.content = dziady;

        bookstore.add(book);
        bookstore.add(book2);
        bookstore.add(book3);
    }
}
