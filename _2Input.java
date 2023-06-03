import java.util.Scanner;
class Input
{
	public static void main(String [] args)
	
	{
		Scanner scan=new Scanner(System.in); // Here the "scan" named object of scanner is created for further use. 
		System.out.print("Enter the value: ");
		double value=scan.nextDouble();  //Here the scan is used to take input. nextDouble is used to which type of data is taking as input.
		System.out.println("The value is " + value);
	scan.close();
	}
}