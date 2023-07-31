package SearchingSortingAndBitManipulation;
import java.util.Scanner;
public class _6linearSearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of the element: ");
        int a=sc.nextInt();
        int []arr={5,1,2,4,6};
        int n=arr.length;
        int flag=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                flag=0;
                System.out.println(arr[i] + " is at index: "+ i);
            }
        }
        if(flag==-1){
            System.out.println("Element not found");
        }
        sc.close();
    }
}