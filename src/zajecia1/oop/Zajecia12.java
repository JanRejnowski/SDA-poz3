package zajecia1.oop;

import java.io.IOException;

/**
 * Created by RENT on 2017-04-24.
 */
public class Zajecia12 {
    public static void main(String[] args) throws IOException{
        User user = new User();
        user.firstName = "Jan";
        user.lastName = "Kowalski";
        user.phoneNumber = "898623137";
//        user.adress = "Poznan, ul. Pierwsza 23";
        user.age = 40;

        System.out.println(user.firstName + " " + user.lastName + " age: " + user.age);
        System.out.println("Phone number: " + user.phoneNumber);
        System.out.println("Adress: " + user.adress);

        Adress adress = new Adress();
        adress.city = "Poznan";
        adress.street = "Dluga";
        adress.postalCode = "23-234";
        adress.land = "Poland";
        adress.flatNumber = 23;
        adress.land = "Poland";

        adress.display();
    }


}
