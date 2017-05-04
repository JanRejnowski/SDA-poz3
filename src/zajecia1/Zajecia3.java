package zajecia1;


import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 */
public class Zajecia3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert your weight: ");
//        int weight = scanner.nextInt();
//        System.out.println("Insert your height in meters: ");
//        double height = scanner.nextDouble();
//        bmi(weight, height);
//        System.out.println("Insert temperature in F: ");
//        int fahrenheit = scanner.nextInt();
//        System.out.println("Insert temperature in C: ");
//        int celsius = scanner.nextInt();
//        fahrenheitToCelsius(fahrenheit);
//        celsiusToFahrenheit(celsius);
//        System.out.println("Insert first number: ");
//        int a = scanner.nextInt();
//        System.out.println("Insert second number: ");
//        int b = scanner.nextInt();
//        System.out.println("Insert third number: ");
//        int c = scanner.nextInt();
//        minMax(a, b, c);
    }

    public static void bmi(int weight, double heightInMeters) {
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("Twoje bmi to: " + bmi);
        if(bmi < 18.5){
            System.out.println("Masz niedowage");
        } else if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Twoja waga jest ok");
        } else {
            System.out.println("Masz nadwage");
        }
    }

    public static void fahrenheitToCelsius(int fahrenheit) {
        //(fahrenheit - 32) / 1.8
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + "F" + "=" + celsius + "C");
    }

    public static void celsiusToFahrenheit(int celsius) {
        //(fahrenheit - 32) / 1.8
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + "C" + "=" + fahrenheit + "F");
    }

    public static void minMax(int a, int b, int c) {
        int min, max;
        if(a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        if(a <= b && a <= c) {
            min = a;
        } else if(b <= a && b <= c){
            min = b;
        } else {
            min = c;
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}