package zajecia1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-10.
 */
public class Zajecia5 {
    public static void main(String[] args) {

        Zajecia4.displayArray(getArray(10));
        Zajecia4.displayArray(getArray(11));
    }

    public static int[] getArray(int value) {
       //oblicz size
       //utworzyc nowa tablice
       //w petli ustawic wartosci
       //zwrocic
        int size = value/2;              // wcześniej było value/2 + value % 2
        int[] array = new int [size];
        for(int i = 0; i < array.length; i++){
            array[i] = 2 * i + value % 2;
        }
        return array;
    }
}
