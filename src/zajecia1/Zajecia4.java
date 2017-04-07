package zajecia1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-07.
 */
public class Zajecia4 {
    public static void main(String[] args) {
//        int dayInVariable = 2;
//        int monthInVariable = 5;
//        int yearInVariable = 2017;
//          displayDate(dayInVariable, monthInVariable, yearInVariable);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert day: ");
//        int dayFromUser = scanner.nextInt ();
//        System.out.println("Insert day: ");
//        int monthFromUser = scanner.nextInt ();
//        System.out.println("Insert day: ");
//        int yearFromUser = scanner.nextInt ();
//        displayDate (dayFromUser, monthFromUser, yearFromUser);

     int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13};
     int minValue = minFromArray(array);
     int maxValue = maxFromArray(array);
     int plus = Sum(array);
     double avg = avg(array);
     statistic(array);
    }

    public static int minFromArray(int[] array){
        int min = array[0];
        for(int i = 1; i < 12; i++){
            if (array[i] < min  ){
                min = array[i];
            }
        }
        return min;
    }

    public static int maxFromArray(int[] array){
        int max = array[0];
        for(int i = 1; i < 12; i++){
            if (array[i] > max ){
                max = array[i];
            }
        }
        return max;
    }

    public static void displayDate (int day, int month, int year){
        if(day < 1 && day > 31 && month < 12 && year < 0){
            System.out.println("The date is incorrect.");
        } else {
            System.out.println(day + "." + month + "." + year);
        }
    }

    public static int Sum(int[] array){
        int sum = 0;
        for(int i = 0; i < 12; i++){
            sum += array[i];
        }
        return sum;
    }

    public static double avg(int[] array){
        int sum = Sum(array);
        return sum / (double) array.length;
    }
    public static int span (int[] array){
        int min = minFromArray(array);
        int max = maxFromArray(array);
        int result = max - min;
        return abs(result);
//       return abs (maxFromArray(array) - minFromArray(array));

    }

    public static int abs (int number) {

        if(number < 0) {
            number *= -1;
        }
        return number;
    }

    public static void statistic (int[] array) {
        System.out.println("Minimal value: " + minFromArray(array));
        System.out.println("Max value: " + maxFromArray(array));
        System.out.println("Sum: " + Sum(array));
        System.out.println("Average: " + avg(array));
        System.out.println("Span: " + span(array));
        System.out.print("Reversed: ");
        reverse(array);
    }

    public static void reverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
