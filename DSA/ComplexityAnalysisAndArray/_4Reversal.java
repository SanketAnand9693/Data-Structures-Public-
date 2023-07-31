package ComplexityAnalysisAndArray;
//Time Comlexity- O(n)
//Space Complexity-O(1)
public class _4Reversal {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,6};
        int size=arr.length; 
        int temp=0;
        for(int i=0;i<size/2;i++){
            temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;     
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();    }
}
