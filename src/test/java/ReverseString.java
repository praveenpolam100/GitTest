import java.util.Objects;

public class ReverseString {

    public static String reverseStringusingStringBuilder(String message){

        String returnMessage = "\0";
       if(!message.isEmpty()){
           StringBuilder stringBuilder = new StringBuilder(message);
           stringBuilder.reverse();
           returnMessage = stringBuilder.toString();

       }
        return returnMessage;
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

    public static Object reverseStringusingObject(Object object){

        if (!(object instanceof String || object instanceof Integer)){

            throw new IllegalArgumentException("The object is not a String or not a Integer");
        }

        Object returnObject=null;

        if(object instanceof String){


            StringBuilder stringBuilder = new StringBuilder(String.valueOf(object));
            returnObject = stringBuilder.reverse().toString();



        }

        if (object instanceof Integer){

            int number = (Integer) object;

            int reverseNumber = 0;

            while(number >0){
                int lastDigit = number%10;
                reverseNumber = reverseNumber*10+lastDigit;
                number = number/10;
            }

            returnObject = reverseNumber;
        }

        return returnObject;

    }


    public static void main(String[] args) {

        String message ="praveen";
        String revmessage = reverseStringUsingloop(message);
        System.out.println(revmessage);

        Object object = reverseStringusingObject(5656);

        System.out.println(object);
        Object object = reverseStringusingObject("Praveen");
        System.out.println(object);
        


    }
}
