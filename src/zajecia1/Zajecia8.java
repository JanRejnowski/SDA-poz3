package zajecia1;

/**
 * Created by RENT on 2017-04-13.
 */
public class Zajecia8 {
    public static void main(String[] args) {
        String message = "Ala ma kota.";
//        message += "i dwa psy";
//        System.out.println(message);

//        char znak = 'a';
//        for (int i = 0; i < 26; i++) {
//            System.out.print(znak + ", ");
//            znak++;
//        }
//        char[] charArray = message.toCharArray();
//        System.out.println(message.length());
    }

    public static int countCharacterIn(String message, char character) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0;i < charArray.length; i++){
            if(charArray[i] == character){
                counter++;
            }
        }
        return counter;
    }

    public static int countCapitalLetters(String message){
        char[] charArray = message.toCharArray();
        int count = 0;
        for(int i = 0; i < charArray.length; i++){
            if (charArray[i] >= 65 && charArray[i] <= 90){
                count++;
            }
        }
        return count;
    }

    public static int countSmallLetters(String message){
        char[] charArray = message.toCharArray();
        int count = 0;
        for(int i = 0; i < charArray.length; i++){
            if (charArray[i] >= 97 || charArray[i] <= 122){
                count++;
            }
        }
        return count;
    }

    public static int countWords(String message){
        char[] charArray = message.toCharArray();
        int counter = 1;
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] == ' ' ){
                counter ++;
            }
        }
        return counter;
    }

    public static String switchCase(String message){
        char[] charArray = message.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if (charArray[i] >= 65 && charArray[i] <= 90){
                charArray[i] -= 32;
            } else if (charArray[i] >= 97 && charArray[i] <= 122){
                charArray[i] += 32;
            }
        }
        return String.valueOf(charArray);
    }

    public static String ananimOf(String message){
        char[] charArray = message.toCharArray();
        int[] newArray = new int[charArray.length];
        for(int i = 0; i < charArray.length; i++){
            newArray[i] = charArray[charArray.length - i - 1];
        }
        return String.valueOf(charArray);
    }

    public static boolean isPalindrome(String message){
        char[] charArray = message.toCharArray();
        boolean palindrome = true;
        int i = 0;
        while(palindrome){
            if(charArray[i] != charArray[charArray.length - i - 1]){
                palindrome = false;
            }
        }
        return palindrome;
    }


}
