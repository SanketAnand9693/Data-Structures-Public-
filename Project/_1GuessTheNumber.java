//using OOPS method of creation

package Project;
import java.util.Scanner;

public class _1GuessTheNumber {
    int guess;  //guessed number
    int number; // Number that has to be guess
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        _1GuessTheNumber data= new _1GuessTheNumber();
        System.out.println("Enter number");
        data.number=scan.nextInt();
        while (true) {
            System.out.println("Guess the Number: ");
            data.guess=scan.nextInt();
            if(data.guess==data.number){
                System.out.println("Hurray");
                break;
            }
            else if(data.guess<data.number){
                System.out.println("Try entering higher number");
            }
            else{
                System.out.println("Try entering lessor number");
            }
            }
            scan.close();      
        
    }
}
