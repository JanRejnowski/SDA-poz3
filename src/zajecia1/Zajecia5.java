package zajecia1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-10.
 */
public class Zajecia5 {
    public static void main(String[] args) {
//        Zajecia4.statistics()
//        Zajecia4.displayArray(getArray(10));
//        Zajecia4.displayArray(getArray(11));
//        getRandomArray(5,10);
//        printSquare(5);
//        printTriangle(3);
//        printMatrixOfNumbers(3);
//        printOneMatrix(3);
//        printOnesMatrix(4);
//        PrintEmptySquare(5);
        tree(3);
    }


    public static int[] getArray(int value) {
        //oblicz size
        //utworzyc nowa tablice
        //w petli ustawic wartosci
        //zwrocic
        int size = value / 2;              // wcześniej było value/2 + value % 2
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + value % 2;
        }
        return array;
    }

    public static void randomTest() {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10) - 5);
        System.out.println(random.nextInt(15) + 5);
    }

    public static int[] getRandomArray(int size, int bound) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + 0;
        }
        return getRandomArray(size, bound, 0);
    }

    public static int[] getRandomArray(int size, int bound, int offset) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + offset;
        }
        return array;
    }

    public static void printSquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

    public static void printTriangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    public static void printMatrixOfNumbers(int a){
//        int number = 1;
//        for (int i = 0; i < a; i++){
//            for (int j = 0; j < a; j++){
//                System.out.print(number + " ");
//                number ++;
//            }
//            System.out.println();
//        }
//    }

//    public static void printMatrixOfNumbers(int a){
//        for (int i = 0; i < a; i++){
//            for (int j = 0; j < a; j++) {
//                System.out.print((a * 1));
//            }
//        }
//    }

    public static void printOneMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == i) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void printOnesMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else if ((i + j) % 2 == 1) {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void PrintEmptySquare(int a) {
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                if((i == 0 || i == (a - 1) || (j == 0 || j == (a-1)))){
                    System.out.print("1 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void tree(int a) {
        for (int i = 0; i < a; i++){
            for(int j = 0; j < a - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2*i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}