package DSA;
//Time Complexity-O(m*n)
//Space Complexity-O(19)
import java.util.Scanner;
public class _SumOf2DArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println("Enter start Row: ");
        int r1=sc.nextInt();
        System.out.println("Enter last Row: ");
        int r2=sc.nextInt();
        System.out.println("Enter start Column: ");
        int c1=sc.nextInt();
        System.out.println("Enter Last Column: ");
        int c2=sc.nextInt();
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}