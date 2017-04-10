package zajecia1;

import java.util.Scanner;

/**
 * Created by Użytkownik on 2017-04-09.
 */
public class zadaniedomowe1 {
    public static void main(String[] args) {
        int[] array = getArrayFromUser();
        reversedArray(array);
        displayReversed(array);

    }

    public static int[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number of elements: ");
        int size = scanner.nextInt();
        int[] array = new int [size];
        for(int i = 0; i < array.length; i++){
            System.out.println("Insert next number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] reversedArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0 ; i < array.length; i++){
            newArray[array.length - i - 1] = array[i];
        }
        return newArray;
    }

    public static void displayReversed(int[] array){
        displayReversed(reversedArray(array));
    }

}
