import java.util.Scanner;
public class _y
{
    public static void main(String []args)
    {   
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++){
                if(i==j && i<=(n-1)/2 || i+j==n-1 && j>=(n-1)/2 ||
                 i>=(n-1)/2 && j==(n-1)/2)
                { 
                    System.out.print(" * ");
                }
                
                else{
                    System.out.print("   ");
                }
            
                }
                System.out.println();
            }
            scan.close();
        }
}


