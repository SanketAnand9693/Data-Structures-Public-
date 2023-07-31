package ComplexityAnalysisAndArray;
//Time Complexity-O(n)
//Space Complexity-O(1)
public class _5MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7};
        int size=arr.length;
        //sum1 is sum of n natural numbers
        int sum1= ((size+1)*(size+2))/2;
        int sum2=0;
        //sum2 is sum of given array
        for(int i=0;i<size;i++){
            sum2+=arr[i];
        }
        int missing=sum1-sum2;
        System.out.println("Missing element is: "+ missing);
    }    
}
