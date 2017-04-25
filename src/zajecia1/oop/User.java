package zajecia1.oop;

/**
 * Created by RENT on 2017-04-24.
 */
public class User {
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public Adress adress;
    public int age;

    public void display(){
        System.out.println(firstName + " " + lastName + " age: " + age);
        System.out.println("Phone number: " + phoneNumber);
        if(adress != null){
            adress.display();
        } else {
            System.out.println("Address not specified.");
        }
    }


}
