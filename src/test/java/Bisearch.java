public class Bisearch {

    public static int searchAlgirithm(int[] numbers, int num){


        int lowIndex = 0;
        int highIndex = numbers.length-1;

        while(lowIndex<=highIndex){

            int midIndex = lowIndex+(highIndex-lowIndex)/2;

            if(numbers[midIndex] ==num){
                return midIndex;
            }else if (numbers[midIndex] < num){
                lowIndex = midIndex+1;
            }else {
                highIndex = midIndex-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8};
        int num = 6;

        int position = searchAlgirithm(numbers, num);
        System.out.println("The position of the number in the array is: "+position);
    }
}
