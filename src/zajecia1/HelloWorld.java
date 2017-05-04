package zajecia1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */

public class HelloWorld {
    public static void main(String[] args) {
//        sumOfElements();
//        sumOfEven();
//        sumOfPositive();
//        sumOfEvenGraterThan0();
//        avg();
//        sumOf();
//        avgOfMultipliedBy();
//        listEvenGreaterThan0();
//        greaterThan0();
//        arrayTest();
//        checkAge();
//        isNumberEven();
//        checkBigger();
    }

    public static void sumOfElements() {
        int[] array = {1,2,3,4,5,6,7,8,9,4,5,6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void sumOfEven() {
        int[] array = {1,2,3,4,5,6,7,8,9,4,5,6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0 ){
                sum += array[i];
            }
        }
        System.out.println("Sum of even elements is: " + sum);
    }

    public static void sumOfPositive() {
        int[] array = {1,2,3,4,-5,6,7,-8,-9,-4,-5,6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                sum += array[i];
            }
        }
        System.out.println("Sum of positive numbers is: " + sum);
    }

    public static void sumOfEvenGraterThan0() {
        int[] array = {1,2,-3,-4,5,6,7,-8,-9,-4,5,6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0 && array[i] % 2 == 0){
                sum += array[i];
            }
        }
        System.out.println("Sum: " + sum);
    }

    public static void avg() {
        int[] array = {1,2,3,4,5,6,7,8,9,4,5,6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("No: " + array.length);
        System.out.println("Average: " + sum/(double) array.length);
    }

    public static void sumOf() {
        int number = 10;
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void avgOfMultipliedBy() {
        int[] array = {1, 2, 2, 3};
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            sum += array[i] * i;
        }
        System.out.println(sum/(double) array.length);
    }

    public static void listEvenGreaterThan0() {
        int[] array = {1,2,3,-4,-5,-6,7,-8,-9,4,-5,6};
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0 && array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }

    public static void greaterThan0() {
        int[] array = {1,2,3,-4,-5,-6,7,-8,-9,4,5,6};
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                System.out.println(array[i]);
            }
        }
    }

    public static void arrayTest() {
        int[] array = {1,2,3,4,5,6,7,8,9,4,5,6};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void checkAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("Age over 18");
        } else {
            System.out.println("Age under 18");
        }
    }

    public static void isNumberEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void checkBigger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();
        if(number1 > number2){
            System.out.println("Number 1 is bigger!");
        } else if(number1 == number2){
            System.out.println("Number 1 is equal to number 2!");
        } else {
            System.out.println("Number 2 is bigger!");
        }
    }
}