package Recursion;

import java.util.Scanner;
//Alternate series-Example->1-2+3-4+5
public class _20AlternateSignSeries{
    public static int  alternateSign(int x){
        if(x==0){
            return 0;
        }
        else if(x%2==0){
            return alternateSign(x-1)-x;
        }
        else{
            return alternateSign(x-1)+x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int result=alternateSign(a);
        System.out.println(result);
        sc.close();
    }
}