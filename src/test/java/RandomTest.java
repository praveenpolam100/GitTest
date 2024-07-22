import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {

    public static void randomNumberGenerator(){

        int inputNumber=0;
        int attempts=0;



        try{
            Random random =  new Random();
            int randomNumber = random.nextInt(100)+1;

            while(randomNumber!=inputNumber){

                Scanner scanner = new Scanner(System.in);
                if(scanner.hasNextInt()) {
                    inputNumber = scanner.nextInt();
                    attempts++;
                }else {
                    System.out.println("Enter Number only.");
                }


                if (inputNumber== randomNumber){
                    System.out.println("Success");
                }
                if(inputNumber< randomNumber){
                    System.out.println("Guess higher Number");
                }
                if(inputNumber> randomNumber){
                    System.out.println("Guess Lower Number");
                }
                if(attempts>10){
                    System.out.println("Exceeded number of attempts:" +attempts);
                    System.out.println("The generated random number was:" +randomNumber);
                    break;
                }

            }
            System.out.println("Number of attempts made:" + attempts);

        }catch(InputMismatchException me){
            throw new InputMismatchException("Enter Number only");

        }catch (Exception e){
            e.printStackTrace();
        }
            
   }

    public static void main(String[] args) {
        randomNumberGenerator();
    }
}
