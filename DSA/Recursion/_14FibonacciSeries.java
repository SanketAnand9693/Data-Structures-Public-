package Recursion;
//Time Complexity-O(2^n)
//Space Complexity-O(n)
import java.util.Scanner;

public class _14FibonacciSeries {
    public static int fibonacciNumber(int num){
        int output=0;
        if(num<=1){
            return num;
        }
        else{
            output=fibonacciNumber(num-1)+fibonacciNumber(num-2);
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int result=fibonacciNumber(a);
        System.out.println(result);
        sc.close();

    }
}
