package zajecia1;

import java.util.Scanner;

/**
 * Created by Użytkownik on 2017-04-09.
 */
public class zadaniedomowe1 {
    public static void main(String[] args) {
        int[] array = getArrayFromUser();
        reversedArray(array);
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

    public static void reversedArray(int[] array) {
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }

}
