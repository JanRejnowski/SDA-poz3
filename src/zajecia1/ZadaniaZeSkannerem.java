package zajecia1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */
public class ZadaniaZeSkannerem {
    public static void main(String[] args) {
        max();
    }


    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number:");
        int number = scanner.nextInt();
        System.out.println("Insert second number:");
        int number2 = scanner.nextInt();
        if (number > number2) {
            System.out.println("First number is bigger");
        } else if (number == number2) {
            System.out.println("Number are equal");
        } else {
            System.out.println("Second number is bigger");
        }
    }
}
