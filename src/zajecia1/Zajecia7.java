package zajecia1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-12.
 */
public class Zajecia7 {
   public static void main(String[] args) {
       int[][] matrix = fillWithRandomNumbers(3,3);
       for(int i = 0; i < 100; i++){
           matrix = biggerValues(matrix, fillWithRandomNumbers(3,3));
           if(i % 10 == 0){
               printMatrix(matrix);
           }
           printMatrix(matrix);
       }
//       printMatrix(fillWithRandomNumbers(3,4);
//       printMatrix(matrix);
//       Scanner scanner = new Scanner(System.in);
//       System.out.println("Insert number of rows: ");
//       int rows = scanner.nextInt();
//       System.out.println("Insert number of columns: ");
//       int columns = scanner.nextInt();
//       int[][] matrix = fillWithNumbersFromUser(rows, columns);
//       printMatrix(flip(matrix));
//       printMatrix(matrix);
//       int[][] matrix1 = fillWithRandomNumbers(rows, columns);
//       int[][] matrix2 = fillWithRandomNumbers(rows, columns);
//       printMatrix(addTwoMatrix(matrix1, matrix2));
//       int[][] matrix = {{1,2,3}, {3,2,1}, {2,3,1}};
//       printMatrix(multiplyBy(matrix, 3));
//       System.out.println(sumOfElements(matrix));
    }

    public static int[][] saveToMatrixExample() {
        int rows = 2;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++ ){
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int i = 0; i < rows; i++) {
            System.out.print("|");
            for(int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]);
                if(j != columns - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("|");
        }
    }

    public static int[][] fillWithNumbersFromUser(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Number[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] fillWithRandomNumbers(int rows, int columns){
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = random.nextInt(30) - 15;
            }
        }
        return matrix;
    }

    public static int[][] addTwoMatrix(int[][] matrix1, int[][] matrix2){
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
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

    public static int sumOfElements(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += Zajecia4.sum(matrix[i]);
        }
        return sum;
    }

    public static int indexOfHighestSum(int[][] matrix){
        int indexOfHighestRow = 0;
        for(int i = 1; i < matrix.length; i++){
            if (Zajecia4.sum(matrix[indexOfHighestRow]) < Zajecia4.sum(matrix[i])) {
                indexOfHighestRow = i;
            }
        }
        return indexOfHighestRow;
    }

    public static int[][] flip(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                newMatrix[j][i] = matrix [i][j];
            }
        }
        return newMatrix;
    }

    public static int[][] biggerValues (int[][] matrix1, int[][] matrix2){
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[0].length; j++){
                if(matrix1[i][j] > matrix2[i][j]){
                    resultMatrix[i][j] = matrix1[i][j];
                } else {
                    resultMatrix[i][j] = matrix2[i][j];
                }
            }
        }
        return resultMatrix;
    }

    public static int maxValue(int[][] matrix){
        int max = Zajecia4.maxFromArray(matrix[0]);
        for (int i = 1; i < matrix.length; i++){
            int maxCandidate = Zajecia4.maxFromArray(matrix[i]);
               if( max < maxCandidate){
                   max = maxCandidate;
            }
        }
        return max;
    }

    public static int[][] product(int[][] matrix1, int[][] matrix2) {
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
}
