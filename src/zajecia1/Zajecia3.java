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
//        System.out.println("Insert your height: ");
//        int height = scanner.nextInt();
//        bmi(weight, height);

//        System.out.println("Enter temperature in Fahrenheit: ");
//        int fahrenheit = scanner.nextInt();
//        fahrenheitToCelsius(fahrenheit);

//        System.out.println("Enter temperature in Celsius: ");
//        int celsius = scanner.nextInt();
//        celsiusToFahrenheit(celsius);

//        System.out.println("Enter first number: ");
//        int a = scanner.nextInt();
//        System.out.println("Enter second number: ");
//        int b = scanner.nextInt();
//        System.out.println("Enter third number: ");
//        int c = scanner.nextInt();
//        minMax(a, b, c);

    }

    public static void bmi (int weight, double heightInMeters){
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("Twoje bmi to: " + bmi);
        if(bmi < 18.5) {
            System.out.println("Masz niedowagę.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Twoja waga jest ok.");
        } else {
            System.out.println("Masz nadwagę");
        }
    }

    public static void fahrenheitToCelsius(int fahrenheit){
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + "F = " + celsius + "C");
    }

    public static void celsiusToFahrenheit(int celsius){
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + "C = " + fahrenheit + "F");
    }

    public static void minMax(int a, int b, int c){
        int min, max;
        if (a >= b && a >= c){
            max = a;
        } else if(b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        if (a <= b && a <= c){
            min = a;
        } else if (b <= a && b <= c){
            min = b;
        } else {
            min = c;
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}