package DSA;
import java.util.Scanner;
public class _1Recursion{
    
    int addition(int a){
            if(a<=0){
                return 0;
            }
            return a+addition(a-1);
    }
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a value: ");
            int a=sc.nextInt();
            _1Recursion result= new _1Recursion();
            int output=result.addition(a);
            System.out.println(output);            
        }
    }
}
    
