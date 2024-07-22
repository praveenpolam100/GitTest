public class Test {

    public static int add(int a, int b){

        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiplyTwoInt(int a, int b){

        return a*b;
    }

    public static int largeNumberbetweenTwo(int a, int b){

        return Math.max(a, b);
    }



    public static void main(String[] args) {

        int sum = Test.add(10, 20);
        System.out.println(sum);
       int sum1 =  Test.add(10, 20, 40);
       System.out.println(sum1);
    }
}
