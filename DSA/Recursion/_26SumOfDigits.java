package Recursion;
import java.util.Scanner;
public class _26SumOfDigits {
    public static int sumOfDigits(int x){
        if(x==0){
            return 0;
        }
        else{
            return (x%10)+ sumOfDigits(x/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a=sc.nextInt();
        int result=sumOfDigits(a);
        System.out.println(result);
        sc.close();
    }
}
