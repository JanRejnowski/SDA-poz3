package zajecia1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-12.
 */
public class Zajecia7 {
    public static void main(String[] args) {
//        printMatrix(fillWithNumbersFromUser(2,2));
//        int[][] matrix1 = fillWithRandomNumbers(3, 4);
//        int[][] matrix2 = fillWithRandomNumbers(4, 8);
//        printMatrix(product(matrix1,matrix2));
//        System.out.println(maxValue(matrix1));
        int[][] matrix = fillWithNumbersFromUser(2,2);
//        printMatrix(flip(matrix));
        System.out.println(sumOfElements(matrix));
        printMatrix(multiplyBy(matrix, 5));
    }

    public static int[][] saveToMatrixExample(){
        int rows = 2;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int i = 0; i < rows; i++){
            System.out.print("|");
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j]);
                if(j != columns - 1){
                    System.out.print(", ");
                }
            }
            System.out.println("|");
        }
    }

    public static int[][] fillWithNumbersFromUser(int rows, int columns){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++) {
                System.out.print("Numbers[" + i +"][" + j + "]: " );
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] product(int[][] matrix1, int[][] matrix2){
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix2[0].length; j++){
                for(int k = 0; k < matrix2.length; k++){
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }

    public static int[][] fillWithRandomNumbers(int rows, int columns){
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = random.nextInt();
            }
        }
        return matrix;
    }

    public static int maxValue(int[][] matrix){
        int max = Zajecia4.maxFromArray(matrix[0]);
        for(int i = 1; i < matrix.length; i++){
            int maxCandidate = Zajecia4.maxFromArray(matrix[i]);
            if(max < maxCandidate){
                max = maxCandidate;
            }
        }
        return max;
    }

    public static int[][] biggerValue(int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] > matrix2[i][j]) {
                    resultMatrix[i][j] = matrix1[i][j];
                } else {
                    resultMatrix[i][j] = matrix2[i][j];
                }
            }
        }
        return resultMatrix;
    }

    public static int[][] flip(int[][] matrix){
        int rowsInOldOne = matrix.length;
        int columnsInOldOne = matrix[0].length;
        int[][] resultMatrix = new int[columnsInOldOne][rowsInOldOne];
        for(int i = 0; i < rowsInOldOne; i++){
            for(int j = 0; j < columnsInOldOne; j++){
                resultMatrix[j][i] = matrix[i][j];
            }
        }
        return resultMatrix;
    }

    public static int indexOfHighestSum(int[][] matrix){
        int indexOfHighestRow = 0;
        for(int i = 1; i < matrix.length; i++){
            if(Zajecia4.sum(matrix[indexOfHighestRow]) < Zajecia4.sum(matrix[i])){
                indexOfHighestRow = i;
            }
        }
        return indexOfHighestRow;
    }

    public static int sumOfElements(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += Zajecia4.sum(matrix[i]);
        }
        return sum;
    }

    public static int[][] multiplyBy(int[][] matrix, int value){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] resultMatrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                resultMatrix[i][j] = matrix[i][j] * value;
            }
        }
        return resultMatrix;
    }

    public static int[][] addTwoMatrix(int[][] matrix1, int[][] matrix2){
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++){
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }
 }