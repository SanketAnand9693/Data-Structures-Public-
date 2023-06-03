import java.util.Scanner;
public class _1Demo
{
	public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int value=scan.nextInt();
        while (true) {
            System.out.println("Enter The Value: ");
            int i=scan.nextInt();
            if(i==value){
                System.out.println("Hurray");
                break;
            }
            else if(i<value){
                System.out.println("Try entering higher value");
            }
            else{
                System.out.println("Try entering lessor value");
            }
            } 
            scan.close();          
        }
}