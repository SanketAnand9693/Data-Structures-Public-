package Recursion;
public class _18BinarySearchUsingRecursion{
    public static int binarySearch(int []arr,int low,int high,int a){
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==a){
                return mid;
            }
            else if(arr[mid]>a){
                return binarySearch(arr,low,mid-1, a);
            }
            else{
                return binarySearch(arr, mid+1, high, a);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr={1,3,5,6,7};
        int result=binarySearch(arr,0,arr.length-1, 7);
        System.out.println(result);
    }
}