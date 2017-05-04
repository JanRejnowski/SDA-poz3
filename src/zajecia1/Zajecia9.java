package zajecia1;

/**
 * Created by RENT on 2017-04-14.
 */
public class Zajecia9 {
    public static void main(String[] args) {
//        System.out.println(cezarCode("Wojna",1));
//        System.out.println(cezarDecode(cezarCode("Wojna",1),1));
    }
    public static String cezarCode(String messageToCode, int offset){
        return cezarCoder(messageToCode, offset);
    }

    public static String cezarDecode(String messageToCode, int offset){
        return cezarCoder(messageToCode, -offset);
    }

    public static String cezarCode(String messageToCode){
        return cezarCoder(messageToCode, 1);
    }

    public static String cezarDecode(String coddedMessage){
        return cezarCoder(coddedMessage,-1);
    }

    public static String cezarCoder(String message, int offset){
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] += offset;
        }
        return String.valueOf(charArray);
    }
}
