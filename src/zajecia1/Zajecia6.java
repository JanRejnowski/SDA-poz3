package zajecia1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-11.
 */
public class Zajecia6 {
    public static void main(String[] args) {
//        int number = 10;
//        int counter = 0;
//        Random random = new Random();
//        while(number > 0) {
//            counter++;
//            number -= random.nextInt(3);
//        }
//        System.out.println(counter);
//        printPowersOf2(35)
//
//        Random random = new Random();
//        int result = game(random.nextInt(100));
//        System.out.println("You finished in " + result + " steps.");
        System.out.println(numberOfDigits(10));
    }

    public static void printPowersOf2(int number){
        int value = 1;
        while (value < number){
            System.out.println(value);
            value *= 2;
        }
    }

    public static boolean sumUntil(int[] array, int sum){
        int arraySum = 0;
        int i = 0;
        while (arraySum < sum && i <= array.length) {
            arraySum += array[i];
            i++;
            if (array.length == i){
                return false;
            }
        }
        return arraySum < sum;
    }

    public static boolean avgUntil(int[] array, int avg){
        int arraySum = array[0];
        int i = 1;
        while (arraySum/i < avg && i < array.length){
            arraySum += array[i];
            i++;
        }
        return arraySum/i > avg;
    }

    public static int game(int number) {
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = -1;
        int stepsCounter = 0;
        while(numberFromUser != number){
            System.out.println("Insert next number<0-99>: ");
            numberFromUser = scanner.nextInt();
            stepsCounter ++;

            if (numberFromUser < number) {
                System.out.println("Number is too low");
            } else if (numberFromUser > number) {
                System.out.println("Number is too big");
            }
        }
        return stepsCounter;
    }

    public static int numberOfDigits(int number) {
        int counter = 0;
        while (number != 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    
    // do domu
    public static int sumOfDigits(int number){
        return 0;
    }

    // zadanie domowe
    // -10, 20
    //liczba powtórzeń
    public static int sumOfRandom(int sum) {
        return 0;
    }
}
