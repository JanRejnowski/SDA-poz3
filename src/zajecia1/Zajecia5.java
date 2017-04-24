package zajecia1;

import java.util.Random;

public class Zajecia5 {
    public static void main(String[] args) {
//        randomTest();
        Zajecia4.displayArray(getArray(11));
        printSquare(4);
        printRectangle(3,4);
        printTriangle(3);
        printMatrixOfNumbers(3);
        printOneMatrix(3);
        chessBoard(4);
        printEmptySquare(4);
        tree(3);
    }

    public static void randomTest() {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10) + 5);
        System.out.println(random.nextInt(15) + 5);
    }

    public static int[] getRandomArray(int size) {
        return getRandomArray(size, Integer.MAX_VALUE);
    }

    public static int[] getRandomArray(int size, int bound) {
        return getRandomArray(size, bound, 0);
    }

    public static int[] getRandomArray(int size, int bound, int offset){
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + offset;
        }
        return array;
    }

    public static int[] getArray(int value) {
        int size = value / 2;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + value % 2;
        }
        return array;
    }

    public static void printSquare(int a){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printRectangle(int a, int b){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printTriangle(int a){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printMatrixOfNumbers(int a){
        int number = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printOneMatrix(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(i == j){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void chessBoard(int a){
        for(int i = 0; i < a; i++){
            for (int j = 0; j < a; j++) {
                if((i + j) % 2 == 0 ){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printEmptySquare(int a){
        for(int i = 0; i < a; i++){
            for (int j = 0; j < a; j++) {
                if ((i == 0 || i == (a-1)) || (j == 0 || j == (a - 1))){
                    System.out.print("1 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void tree(int a) {
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a - i - 1; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1 ; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
    }


}