package zajecia1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */
public class ZadaniaZeSkannerem {
    public static void main(String[] args) {
//        addElementsMultipliedBy();
//        incrementElements();
//        addPreviousElement();
//        fillArrayWithKnownSize();
//        fillArrayWithUnknownSize();
//        displayEvenElements();
//        sumOddElements();
//        countEvenElements();
//        max();
        isEven();
    }

    public static void addElementsMultipliedBy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Insert next number: ");
            int element = scanner.nextInt();
            if (i == 0) {
                array[i] = element;
            } else {
                array[i] = array[i - 1] * element;
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println(sum / (double) array.length);
    }

    public static void incrementElements() {
        int[] array = {2, -3, 4, 5, 6, -7, 9, 11, 13};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i]++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void addPreviousElement() {
        int[] array = {2, 5, 6, 9, 5, 4, 3, 2};
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void multiplyBy2() {
        int[] array = {2, 6, 7, 9, 34, 2, 12, 15, 4};
        for (int i = 0; i < array.length; i++){
            if (array[i] % 3 == 0 && array[i] > 0) {
                array[i] *= 2;
            }
        }
    }

    public static void fillArrayWithKnownSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            System.out.println("Insert number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        for (int i = 0; i < array.length; i++){
        System.out.println(array[i]);}
    }

    public static void fillArrayWithUnknownSize() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int [100];
        int element = 1;
        int i = 0;
        while (element != 0){
            System.out.println("Insert next number. Press 0 to break");
            element = scanner.nextInt();
            array[i] = element;
            i++;
        }
        for (int j = 0; j < i; j++){
            System.out.println(array[j]);
        }
    }

    public static void displayEvenElements(){
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }

    public static void sumOddElements() {
        int[] array = {2,5,6,7,8,9,11,15,16,17,35,1,-5,-3,-6,-2};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(i % 2 != 0){
                sum += array[i];
                System.out.println(array[i]);
            }
        }
    }

    public static void countEvenElements() {
        int[] array = {2,3,4,5,6,7,9,11,13};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int number = scanner.nextInt();
        System.out.println("Insert second number: ");
        int number2 = scanner.nextInt();
        if (number > number2) {
            System.out.println("First number is bigger");
        } else if (number == number2) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Number 2 is bigger");
        }
    }

    public static void isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}




