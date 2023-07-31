package Recursion;
//Time Complexity-O(logn base 2)
import java.util.Scanner;
public class _15FindingPowerUsingRecursion{
    public static int findPower(int x, int y){
        int result=0,mid=0,finalResult=0;
        if(y==1){
            return x;
        }
        else{
            mid=y/2;
            result= findPower(x,mid);
            finalResult=result*result;
            if(y%2==0){
                return finalResult;
            }
            else{
                return finalResult*x;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        int Output=findPower(a, b);
        System.out.println(Output);
        sc.close();
    }
}