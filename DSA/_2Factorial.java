package DSA;
public class _2Factorial{
    int factorial(int n){
       if(n<=0 || n==1){
        return 1;
       } 
       else{
        return n* factorial(n-1);
       }
    }
    public static void main(String[] args) {
        _2Factorial result= new _2Factorial();
        result.factorial(5);
    }
}