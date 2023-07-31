package Recursion;
import java.math.BigInteger;
import java.util.Scanner;
public class _17FindingPowerUsingRecursionforLargerNumber{
    public static BigInteger findPower(BigInteger a,int b){
        BigInteger result,finalResult;
        if(b==1){
            return a;
        }
        else{
            int mid=b/2;
            result=findPower(a,mid);
            finalResult=result.multiply(result);
            if(b%2==0){
                return finalResult;
            }
            else{
                return a.multiply(finalResult);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a and b: ");
        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();
        BigInteger result=findPower(a,b);
        System.out.println(result);
        sc.close();
    }
}