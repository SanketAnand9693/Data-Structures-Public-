package Recursion;

import java.util.Scanner;

public class _16CountStairs {
    public static int Countstairs(int num){
        int output=0;
        if(num<=1){
            return num;
        }
        else{
            output=Countstairs(num-1)+Countstairs(num-2);
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int result=Countstairs(a+1);
        System.out.println(result);
        sc.close();

    }
}
