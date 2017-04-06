package zajecia1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello world");
//        System.out.println(5);
//        int number = 2;
//        int secondNumber = 3;
//        System.out.println(secondNumber + 3);
//
//        if (number > 3) {
//            System.out.println("number bigger than 3");
//        } else {
//            System.out.println("number less than 3");
//        }
//       checkAge();
//       isNumberEven();
//       checkBigger();
//      arrayTest();
//      displayEvenNumbers();
//      greaterThan0();
//      listEvenGreaterThan0 ();
//       sum0fElements ();
//       sumOfEven ();
//        sumOfPositive ();
//        sumOfEvenGreaterThan0 ();
//        sumMultipliedBy ();
//        avgsumMultipliedBy ();
//        sumOf();
        //      addPreviousElement ();
        addElementsMultipliedBy();
//        avg();
//          int number1 = 5;
//          int number2 = 3;
//        System.out.println(number1 / (double)number2);
//           Scanner scanner = new Scanner (System.in);
//        String name = scanner.nextLine();
//        System.out.println("Your name is:" + name );
//        int number = scanner.nextInt ();
//        System.out.println("Your number is:" + number);
//        int [] array = {1,2,3,4,5,6,90,89,40,20};
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        System.out.println(array[5]);
//        System.out.println(array[6]);
//        for (int i = 0 ; i < array.length ; i++) { //i++ == i = i + 1
//            System.out.println(array [i]);
//        }
    }

    public static void addElementsMultipliedBy() {
        // pytamy o rozmiar tablicy, tworzymy tablice,
        // w petli "for" dodajemy elementy do tablicy
        // jezeli element jest pierwszy to po prostu dodajemy
        // jezeli element nie jest pierwszy to mnozymy razy poprzedni i wstawiamy
        // na koniec wyswietlamy elementy podzielne tylko przez 3
        // wyswietlamy srednia wszystkich elementow
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Insert next number:");
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

    public static void fillArrayWithUnknownSize() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int element = 1;
        int i = 0;
        while (element != 0) {
            System.out.println("Insert next number. Press 0 to break.");
            element = scanner.nextInt();
            array[i] = element;
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(array[j]);
        }
    }

    public static void fillArrayWithKnowSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Insert next number:");
            int number = scanner.nextInt();
            array[i] = number;
        }
    }

    public static void addPreviousElement() {
        int[] array = {2, -3, 4, 5, 6, -7, 9, 11, 13};
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
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


    public static void countEvenElements() {
        int[] array = {2, 3, 4, 5, 6, 7, 9, 11, 13};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++; // counter = counter +1 lub counter += 1
            }
        }
        System.out.println();
    }

    public static void sumOddElements() {
//        elementy o wartościach nieparzystych
        int[] array = {2, 3, 4, 5, 6, 7, 9, 11, 13};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) { // to samo co ==1
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void displayEvenElements() {
//        co drugi element
        int[] array = {2, 3, 4, 5, 6, 7, 9, 11, 13};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void avgsumMultipliedBy() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * i;
        }
        System.out.println("sum:" + sum);
    }

    public static void sumMultipliedBy() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * i;
        }
        System.out.println(sum / (double) array.length);
    }

    public static void sumOf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert your number:");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum = sum + i;
        }
        System.out.println("sum of:" + sum);
    }

    public static void avg() {
//        średnia
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / (double) array.length);
    }

    public static void sumOfEvenGreaterThan0() {
//        suma parzystych dodatnich
        int[] array = {-1, -2, -3, 6, 7, -8, 9, 0};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("Sum Of Even Greater Than 0:" + sum);
    }

    public static void sumOfPositive() {
//        suma dodatnich
        int[] array = {-1, -4, 4, -6, 5, -9, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("sum of positive:" + sum);

    }

    public static void sumOfEven() {
//        suma tylko parzystych
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];

            }
        }
        System.out.println("sum of even:" + sum);

    }

    public static void sum0fElements() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum:" + sum);
    }

    public static void listEvenGreaterThan0() {
        int[] array = {-1, 2, -3, -4, -5, 6, 7, -8, 9, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void greaterThan0() {
        int[] array = {-1, 2, -3, 4, -5, 6, 7, -8, 9, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void arrayTest() {
        int[] array = {1, 3, 5, 6, 8, 9, 22, 56};
        for (int i = 0; i < array.length; i++) { //i++ == i = i + 1
            System.out.println(array[i]);
        }

    }

    public static void displayEvenNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void checkAge() {
        int age = 18;
        if (age >= 18) {
            System.out.println("Age over 18");
        } else {
            System.out.println("Age under 18");
        }
    }

    public static void isNumberEven() {
        int number = 3;
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void checkBigger() {
        int number1 = 6;
        int number2 = 6;
        if (number1 > number2) {
            System.out.println("Number1 is bigger");
        } else if (number1 == number2) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("Number2 is bigger");
        }

    }
}

