package zajecia1;

import java.util.Random;

/**
 * Created by RENT on 2017-04-20.
 */
public class Zajecia10 {
    public static void main(String[] args) {
//        String message = "Ala ma kota";
//        System.out.println(find(message, 'm'));
//        printStringStatistics(stringStatistics("Ala ma kota i borsuka"));
    }

//    public static int find(String message, char sentence){
//        int index = 0;
//        for(int i = 0; i < message.length(); i++){
//            if(message.charAt(i) == sentence){
//                index += i;
//            }
//        }
//        return index;
//    }
    public static int find(String message, char sentence){
        char[] charArray = message.toCharArray();
        int i = 0;
        while( i < charArray.length && charArray[i] != sentence){
            i++;
        }
        return i == charArray.length ? -1 : i;
    }

    public static int countAll(String message, char sentence){
        char[] charArray = message.toCharArray();
        int counter = 0;
        for(int i = 0; i < charArray.length; i++){
            if(toLowerCase(charArray[i]) == toLowerCase(sentence)){
                counter++;
            }
        }
        return counter;
    }

    public static char toLowerCase(char a){
        if(a >= 65 && a <= 90){
            a += 32;
        }
        return a;
    }

    public static int[] stringStatistics(String message) {
        char[] charArray = message.toCharArray();
        int[] ints = new int[26];
        for (int i = 0; i < charArray.length ; i++) {
            char charInLowerCase = toLowerCase(charArray[i]);
            if(charInLowerCase >= 97 && charInLowerCase <= 122){
                ints[charInLowerCase - 97]++;
            }
        }
        return ints;
    }

    public static void printStringStatistics(int[] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char)i + 97);
            }
        }
    }

    public static int multiplyDigits(int number) {
        int product = 1;
        while(number != 0){
            product *= number % 10;
            number /= 10;
        }
        return product;
    }

    public static int[][] randomMatrix(int size, int bounds, int offset){
        Random random = new Random();
        int[][] resultMatrix = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                resultMatrix[i][j] = random.nextInt(bounds) + offset;
            }
        }
        return resultMatrix;
    }

    public static double avg(int[][] matrix){
        int sum = sum(matrix);
        return sum / (double)(matrix.length * matrix[0].length);
    }

    public static int sum (int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static double[][] avg(int[][] matrix1, int[][] matrix2){
        double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[0].length; j++){
                resultMatrix[i][j] = (matrix1[i][j] + matrix2[i][j]) / 2.0;
            }
        }
        return resultMatrix;
    }
}
