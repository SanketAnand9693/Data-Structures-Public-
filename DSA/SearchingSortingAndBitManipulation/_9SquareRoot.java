package SearchingSortingAndBitManipulation;
import java.util.Scanner;
public class _9SquareRoot{
    public static int squareRoot(int num){
        int low=0,high=num,result=-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            long val=mid*mid;
            if(val==num){
                return mid;
            }
            else if (val<num){
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
                    }
        return result;
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int num=sc.nextInt();
        int output=squareRoot(num);
        System.out.println(output);
        sc.close();
    }
}