package Recursion;

import java.util.Scanner;

public class _19nMultiple {
    public static int nMultiple(int a, int k){
        if(k==1){
            return a;
        }
        else{
            return a* nMultiple(a, k-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int k=sc.nextInt();
        int result=nMultiple(a, k);
        System.out.println(result);
        sc.close();
    }
}
