package SearchingSortingAndBitManipulation;
//importing Scanner package
import java.util.Scanner;

public class _8LowerBound {
    public static int findFirstOccurence(int arr[],int target){
        int low=0,high=arr.length-1,result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high= mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target=sc.nextInt();
        sc.close();
        int result = findFirstOccurence(arr, target);
        if(result == -1){
            System.out.println("Target element is not present in an array");
        }
        else{
            System.out.println("Target element first occurence is present at index: "+result);
        }
    }
}
