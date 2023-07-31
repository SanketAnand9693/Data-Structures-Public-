package SearchingSortingAndBitManipulation;
import java.util.Scanner;
//Time Complexity- O(logn)
//Space Complexity-O(1)
public class _7BinarySearch{
    public static int BinarySearch(int []arr,int target){
        int low=0,high=arr.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2; //Note: this is used to calculate mid of an array.It prevents data overflow.
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,6,9};
        int a=sc.nextInt();
        
        int result=BinarySearch(arr,a);
        if(result==0){
            System.out.println("No element found");
        }
        else{
            System.out.println("Element found at: "+ result);
        }
        sc.close();
    }
}