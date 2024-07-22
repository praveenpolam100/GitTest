import java.util.Random;
import java.util.Scanner;

public class RandomTest {

    public static void randomNumberGenerator(){

        try{
             Scanner scanner = new Scanner(System.in);
              int inputNumber = scanner.nextInt();
        }catch(InputMismatchException me){
            //return exception and continue

        }
            
       

        System.out.println(inputNumber);

        Random random =  new Random();
        int randomNumber = random.nextInt(100)+1;

        System.out.println(randomNumber);

    }

    public static void main(String[] args) {
        randomNumberGenerator();
    }
}
