package zajecia1;

/**
 * Created by RENT on 2017-04-04.
 */

public class HelloWorld {
    public static void main(String[] args) {
//        sumOfElements();
//        sumOfEven();
//        sumOfPositive();
//        sumOfEvenGreaterThan0();
//        avg();
//        sumOf();
//        avgMultiplied();
//        displayEvenNumbers();
//        listEvenGreaterThan0();
//        greaterThan0();
//        arrayTest();
//        checkAge();
//        isNumberEven();
//        checkBigger();
    }

    public static void sumOfElements() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void sumOfEven(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }

    public static void sumOfPositive(){
        int[] array = {1,2,3,4,-5,6,-7,8,-9,0};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                sum += array[i];
            }
        }
        System.out.println("Sum of positive numbers: " + sum);
    }

    public static void sumOfEvenGreaterThan0(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0 && array[i] > 0){
                sum += array[i];
            }
        }
        System.out.println("The sum of even greater than 0 is: " + sum);
    }

    public static void avg(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("No: " + array.length);
        System.out.println("Average: " + sum / (double) array.length);
    }

    public static void sumOf(){
        int number = 10;
        int sum = 0;
        for (int i = 0; i < number; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void avgMultiplied() {
        int[] array = {1,2,2,3};
        int sum = 0;
        for(int i = 1; i < array.length; i++){
            sum += array[i] * i;
            System.out.println(sum);
        }
        System.out.println(sum / (double) array.length);
    }

    public static void displayEvenNumbers() {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }

    public static void listEvenGreaterThan0() {
        int[] array = {-1, 2, -3, -4, -5, 6, 7, -8, 9, 0};
        for (int i = 0; i < array.length; i++){
            if(array[i] > 0 && array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }

    public static void greaterThan0() {
        int[] array = {-1,-2,-3,-4,-5,-6,-7,6,5,3,2,9};
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                System.out.println(array[i]);
            }
        }
    }

    public static void arrayTest() {
        int[] array = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void checkAge() {
        int age = 15;
        if(age >= 18){
            System.out.println("Age over 18");
        } else {
            System.out.println("Age under 18");
        }
    }

    public static void isNumberEven() {
        int number = 4;
        if (number % 2 == 0){
            System.out.println("Number is even");
        } else{
            System.out.println("Number is odd");
        }
    }

    public static void checkBigger() {
        int number1 = 7;
        int number2 = 9;
        if(number1 > number2){
            System.out.println("Number 1 is bigger.");
        } else if(number1 == number2){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Number 2 is bigger");
        }
    }
}