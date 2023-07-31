package Recursion;
import java.util.Scanner;
public class _22BalanceParenthesis{
    public static void printParenthesis(int n,int oc, int cc, String ans){
        if(oc==n && cc==n){
            System.out.println(ans.toString());
        }
        if(oc<n){
            printParenthesis(n, oc+1, cc, ans+"(");    
        }
        if(oc>cc){
            printParenthesis(n, oc, cc+1, ans+")");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of parethesis to be used: ");
        int n=sc.nextInt();
        printParenthesis(n,0,0,"");
        sc.close();
    }
}