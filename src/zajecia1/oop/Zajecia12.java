package zajecia1.oop;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-24.
 */
public class Zajecia12 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\Program Files (x86)\\SDA\\idea\\SDA-poz3\\test");

        Address firstAddress = new Address();
        firstAddress.flatNumber = 23;
        firstAddress.postalCode = "23-234";
        firstAddress.city = "Poznan";
        firstAddress.land = "Poland";
        firstAddress.street = "Dluga";

        Address secondAddress = new Address();
        secondAddress.flatNumber = 23;
        secondAddress.postalCode = "23-234";
        secondAddress.city = "Warszawa";
        secondAddress.land = "Poland";
        secondAddress.street = "Pierwsza";

        User user = new User();
        user.firstName = "Jan";
        user.lastName = "Kowalski";
        user.phoneNumber = "123456789";
        user.address = firstAddress;
        user.age = 40;

        User user2 = new User();
        user2.firstName = "Anna";
        user2.lastName = "Wisniewska";
        user2.phoneNumber = "9876254";
        user2.address = secondAddress;
        user2.age = 30;

        User[] users = new User[2];
        users[0] = user;
        users[1] = user2;

        System.out.println();



        user.display();
        user2.display();
        firstAddress.display();
        Address address = user.address;
        address.display();
    }

    public static void writeUserToFile(File file, String[] userDetails) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            for (int i = 0; i < userDetails.length; i++) {
                out.print(userDetails[i]);
                if(i != userDetails.length - 1){
                    out.print(" ");
                }
            }
            out.println();
        }
    }

    public static String getLastNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert last name");
        return scanner.nextLine();
    }

    public static String getFirstNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first name");
        return scanner.nextLine();
    }

    public static String getPhoneNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert phone number");
        return scanner.nextLine();
    }

    private static String getAddressFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert address");
        return scanner.nextLine();
    }

    public static String[] getUserFromFile(File file) throws FileNotFoundException{
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        return scanner.nextLine().split(" ");
    }

    public static User getUserDetails() {
        User user = new User();
        user.firstName = getFirstNameFromUser();
        user.lastName = getLastNameFromUser();
        user.phoneNumber = getPhoneNumberFromUser();
        return user;
    }
}
