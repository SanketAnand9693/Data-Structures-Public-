package SearchingSortingAndBitManipulation;
//Time Complexity-O(n^2)
//Space COmplexity-O(1)
public class _10BubbleSort{
    public static void bubbleSort(int []arr){
        for(int i=0;i<arr.length;i++){
            Boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,7,5,7,9,8};
        display(arr);
        bubbleSort(arr);
        System.out.println();
        display(arr);
    }
}