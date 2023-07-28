package abhi.coding.solution.basics.dynamicprogramming;

public class Fibonacci {
    int[] f;
    public static void main(String[] args) {
        
        Fibonacci fibonacci=new Fibonacci();
        System.out.println("Hello its working");
        int n = 1;
        fibonacci.f =new int[n];
    }
    private static int findFibonacci(int n){
        if (n<1)
            return -1;
        if (n<=2)
            return 1;
        return 0;
    }
    private static int exceptionCheck() throws Throwable{
        int var=0/0;
        return var;
    }
}
