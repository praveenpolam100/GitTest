import java.util.Objects;

public class ReverseString {

    public static String reverseStringusingStringBuilder(String message){

        StringBuilder stringBuilder = new StringBuilder(message);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static String reverseStringUsingloop(String message){

        if(message.isEmpty()){
            System.out.println("Send a valid message");
            System.exit(0);
        }

        char[] charMessage = message.toCharArray();
        String revString = "";

        for (int i = charMessage.length-1; i>=0; i--){

            revString = revString+message.charAt(i);


        }

        return  revString;
    }


    public static void main(String[] args) {

        String message ="praveen";
        String revmessage = reverseStringUsingloop(message);
        System.out.println(revmessage);
    }
}
