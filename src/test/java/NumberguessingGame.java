import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class NumberguessingGame {

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

                if (inputNumber < randNum) {

                    System.out.println("Guess Higher Number");
                }
                if (inputNumber > randNum) {
                    System.out.println("Guess Lower Number");

                }
                if (inputNumber > randNum) {
                    System.out.println("Guess Lower Number");

                }
                if (inputNumber == randNum) {

                    System.out.println("Congratulations");
                }

                attempts = attempts + 1;

            } catch(InputMismatchException ime){
                System.out.println("Enter number only.");

        }

        }while (!(randNum==inputNumber));

        System.out.println("Number of attempts:" +attempts);
        System.out.println("Random number:"+randNum);
        System.out.println("Input number:"+inputNumber);



    }



}
