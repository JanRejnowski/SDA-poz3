package zajecia1;

/**
 * Created by RENT on 2017-04-14.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        String message = "WOJNA";
//        System.out.println(cezarCode(message));
        String messageToCode = "WOJNA";
    }

//    public static String cezarCode(String message) {
//        return cezarCoder(messageToCode, true);
//    }
//
//    public static String cezarDecode(String message) {
//        return cezarCoder(coddedMessage, false);
//    }

    public static String cezarCoder(String message, boolean code){
        char[] charArray = message.toCharArray();
        int offset = code ? 1 : -1;
        for (int i = 0; i < charArray.length; i++){
            charArray[i] += offset;
        }
        return String.valueOf(charArray);
    }

}
