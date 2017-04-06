package zajecia1;


import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 */
public class Zajecia3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int a = scanner.nextInt();
        System.out.println("Insert second number: ");
        int b = scanner.nextInt();
        System.out.println("Insert third number: ");
        int c = scanner.nextInt();

        minMax(a,b,c);

//        fahrenheitToCelsius(80);
//        minMax(8, 9, 40);
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