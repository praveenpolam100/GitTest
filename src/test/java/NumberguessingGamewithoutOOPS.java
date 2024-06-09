import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberguessingGamewithoutOOPS {

    public static void main(String[] args) {

        Random random = new Random();
        int randNum = random.nextInt(100)+1;

        int attempts = 0;
        int inputNumber = 0;

        Scanner scanner;

        do {
            try {

                scanner = new Scanner(System.in);
                inputNumber = scanner.nextInt();

                if (scanner.hasNextInt()){

                    if (inputNumber < randNum) {
                        System.out.println("Guess Higher Number");
                    }
                    if (inputNumber > randNum) {
                        System.out.println("Guess Lower Number");
                    }
                    if (inputNumber == randNum) {

                        System.out.println("Congratulations");
                    }
                    attempts = attempts + 1;


                }else{
                    System.out.println("Enter number only.");

                }

            } catch(Exception e){
                System.out.println("Unknown error occurred.");

        }

        }while (!(randNum==inputNumber));

        System.out.println("Number of attempts:"+attempts);
        System.out.println("Random number:"+randNum);
        System.out.println("Input number:"+inputNumber);



    }



}
