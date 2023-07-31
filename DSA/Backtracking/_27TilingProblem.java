package Backtracking;
import java.util.Scanner;
public class _27TilingProblem{
    public static int gatway(int n){
        if(n<=3){
            return n;
        }
        else{
            return gatway(n-1)+gatway(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of tiling space");
        int x=sc.nextInt();
        int result=gatway(x);
        System.out.println(result);
        sc.close();
    }
}