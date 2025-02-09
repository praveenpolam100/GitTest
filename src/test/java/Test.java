import static java.lang.Math.round;

public class Test {

    public static int add(int a, int b){

        return a+b;
    }
    
    /**
     * Description: addition of three integers
     * Author: Praveen Polam
     * Date: 7/28/2024
     */
    
    public static int addNumbers(int a, int b, int c){
        return a+b+c;
    }
    public static int subtract(int a, int b){
        return Math.abs(a-b);
    }

    public static int multiplyTwoInt(int a, int b){

        return a*b;
    }

    public static int largeNumberbetweenTwo(int a, int b){

        return Math.max(a, b);
    }

    public static float squareRoot(float a){

        return a*a;
    }
    public static float qubeRoot(float a){
        return a*a*a;
    }
    public static int largeNumber(int a, int b){

        return Math.max(a, b);
    }
    
       public static int greaterNumberof3(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }

    public static long roundingdoubleNumber(double a){
        return Math.round(a);
    }

    //print the math table
    public static void mathTable(int num){
        for (int i=1; i<=10; i++){
            System.out.println(num + "*" + i + "="+num*i);
        }
    }


    public static void main(String[] args) {

        int sum = Test.add(10, 20);
        System.out.println(sum);
       int sum1 =  Test.addNumbers(10, 20, 40);
       System.out.println(sum1);
       float sqrootNumber = squareRoot(10);
        System.out.println(sqrootNumber);

        int multiplytwoInt =multiplyTwoInt(10, 35);
        System.out.println(multiplytwoInt);

        System.out.println(roundingdoubleNumber(1234.343f));

        mathTable(5);
    }
}
