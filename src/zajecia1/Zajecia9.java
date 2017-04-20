package zajecia1;

/**
 * Created by RENT on 2017-04-14.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        String superCoddedMessage = cezarCode("Some message to code", 3);
        System.out.println(superCoddedMessage);
        System.out.println(cezarDecode(superCoddedMessage, 3));
    }

    public static String cezarCode(String messageToCode, int offset){ return cezarCoder(messageToCode, offset);}

    public static String cezarDecode(String messageToCode, int offset){ return cezarCoder(messageToCode, -offset);}

//    public static String cezarCode(String messageToCode, int offset){return cezarCoder(messageToCode, 1);}
//
//    public static String cezarDecode(String coddedMessage){
//        return cezarCoder(coddedMessage, -1);
//    }

    private static String cezarCoder(String message,int offset){
        char[] charArray = message.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            charArray[i] += offset;
        }
        return String.valueOf(charArray);
    }
}
