package zajecia1;


import java.nio.channels.Pipe;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 */
public class Zajecia3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert first number: ");
//        int number1 = scanner.nextInt();
//        System.out.println("Insert second number: ");
//        int number2 = scanner.nextInt();
//        System.out.println("Insert third number: ");
//        int number3 = scanner.nextInt();
//        System.out.println("Insert weight");
 //       int weight = scanner.nextInt();
 //       System.out.println("Insert height.");
//        int height = scanner.nextInt();
        System.out.println("Podaje wagę: ");
        int weight = scanner.nextInt();
        System.out.println("Podaj wzrost: ");
        double height = scanner.nextDouble();
        bmi(weight,height);
//        minMax(number1, number2, number3);

//        fahrenheitToCelsius(80);
//        minMax(8, 9, 40);

        }

    public static void bmi(int weight, double heightInMeters) {
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("Your bmi: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Your bmi is low.");
        } else if (bmi > 24.9) {
            System.out.println("Your bmi is too high.");
        } else {
            System.out.println("Your bmi is all right. ");
        }

    }



    public static void fahrenheitToCelsius (int fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + "F = " + celsius + "C");
    }

    public static void CelsiusToFahrenheit (int celsius) {
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + "C = " + fahrenheit + "F");
    }

    public static void minMax(int a, int b, int c) {
        int min, max;
        if(a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        if(a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}