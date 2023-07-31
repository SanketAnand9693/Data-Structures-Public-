package Recursion;
import java.util.Scanner;
public class _21LCBinarySearch2DArray {
    //This can only work if the array is sorted in both row and columns way.
    public static boolean searchMatrix(int[][] matrix, int target) {
        int low=0,m=matrix.length,n=matrix[0].length,high=(m*n)-1;
        if(m==0){
            return false;
        }
        int midIndex,midElement;
        while(low<=high){
            midIndex=low+(high-low)/2;
            int rowIndex=midIndex/n;  //Here rowIndex & colIndex can be find by these techniques.
            int ColIndex=midIndex%n;
            midElement=matrix[rowIndex][ColIndex];
            
            if(midElement==target){
                return true;
            }
            else if(midElement<target){
                low=midIndex+1;
            }
            else{
                high=midIndex-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=sc.nextInt();
        boolean result=searchMatrix(matrix, target);
        System.out.println(result);
        sc.close();

    }
}
