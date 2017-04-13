package zajecia1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-12.
 */
public class Zajecia7 {
    public static void main(String[] args) {
        int[][] matrix = saveToMatrixExample();
//        displayMatrix(matrix);
//        int[][] matrix = {{1,2,3,4,5} {2,3,4,6,7}};
//        /t - backslash;
        displayMatrix(fillwithRandomNumbers(3,4));
    }

    public static int[][] saveToMatrixExample() {
        int rows = 2;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        //save
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i + j; // save
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++){
            System.out.print("|");
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + ", "); //read
            }
            System.out.println("|");
        }
    }

    public static int[][] fillwithRandomNumbers(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = random.nextInt(30) - 15;
            }
        }
        return matrix;
    }

    public static int[][] fillwithNumbersFromUser(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("Insert [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        return matrix;
    }

    public static int[][] addTwoMatrix(int[][] matrix1, int[][] matrix2) {
//        rows ------> matrix.length;
//        columns ------>matrix[0].length
        // nowa macierz
        // dodajemy kolejne elementy do nowej macierzy
        // zwracamy nową macierz
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int [rows][columns];
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j];
            }
        }
        return resultMatrix;
    }

    public static int[][] multiplyBy(int[][] matrix, int value){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] resultMatrix = new int[rows] [columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                resultMatrix[i][j] = matrix[i][j] * value;
            }
        }
        return resultMatrix;
    }

    public static void int sumOfElements(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; i++){
                sum += matrix[i][j];
                // sum += Zajecia4.sum(matrix[i])
            }
        }
        return sum;
    }


}
