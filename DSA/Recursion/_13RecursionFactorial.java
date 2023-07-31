package Recursion;
public class _13RecursionFactorial{
    public static int factorial(int n){
        int result=0;
       if(n<=0 || n==1){
        return 1;
       } 
       else{
        result= n* factorial(n-1);
       }
       return result;
    }
    public static void main(String[] args) {
        int output=factorial(5);
        System.out.println(output);
    }
}