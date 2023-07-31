package LC;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class _23LCgenerateParenthesis{
    public static List<String> printParenthesis(int n,int oc, int cc, String ans,String temp,List<String> Result){
        if(oc==n && cc==n){
            temp=ans;
            Result.add(temp);
        }
        if(oc<n){
            printParenthesis(n, oc+1, cc, ans+"(",temp,Result);    
        }
        if(oc>cc){
            printParenthesis(n, oc, cc+1, ans+")",temp,Result);
        }
        if(ans.length()==n*2){
        System.out.println(ans);
    }
    return Result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of parethesis to be used: ");
        int n=sc.nextInt();
        List<String> solution=new ArrayList<>();
        List<String> answer=printParenthesis(n, 0, 0, "", null, solution);
        System.out.println(answer.toString());
        sc.close();
    }
}