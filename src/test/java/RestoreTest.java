public class RestoreTest {

    public static void reversePyramid(){

        System.out.println();
    }

    /**
     * Description: This logic will print the pyramid in reverse order
     * Author: Praveen Polam
     * Date: 7/26/2024
     */
    
    
    public static void main(String[] args) {

        int number=10;
        int counter = number;

        while(number >=1){

            for (int i=0; i<number; i++){

                System.out.print(" ");

            }
            for (int j=number-1; j<counter; j++){
                System.out.print("* ");

            }
            System.out.println();
            number = number-1;

        }


        }
    }
