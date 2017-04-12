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
//        System.out.println(numberOfDigits(10));
//        System.out.println(sumOfDigits(321));
//        System.out.println(sumOfRandom(215));
//        Zajecia4.displayArray(numberToArray(100));
//        int[] array = {1,7,6,5};
//        System.out.println(arrayToNumber(array));
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


    public static int sumOfDigits(int number){
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static int sumOfRandom(int value){
        Random random = new Random();
        int sum = 0;
        int number = 0;
        while (sum < value){
            sum += random.nextInt(30) - 10;
            number++;
        }
        return number;
    }

    public static int[] numberToArray(int number) {
        int size = 0;
        int[] array = new int[numberOfDigits(number)];
        int i = 0;
        while (i < array.length) {
            int value = number % 10;
            number /= 10;
            array[array.length - i - 1] = value;
            i++;
        }
        return array;
    }

    public static int arrayToNumber(int[] array) {
        int sum = 0;
        int valueToMultiply = 1;
        for(int i = 0; i < array.length; i++){
            sum += array[array.length - i -1] * valueToMultiply;
            valueToMultiply *= 10;
        }
        return sum;
    }
}
