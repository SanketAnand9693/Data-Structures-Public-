package SearchingSortingAndBitManipulation;
//Time Complexity-O(n^2)
//Space Complexity-O(1)
import java.util.Arrays;

public class _12SelectionSort {
    public static void selectionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx]){
                min_idx=j;
                }
            }
            if(min_idx!=i){
                int temp=arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={20,50,12,17,19,25,97,16};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
