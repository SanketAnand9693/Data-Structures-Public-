import java.util.Scanner;
public class _0hello{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int array[]=new int[a];
        for(int i=0;i<a;i++){
            array[i]=scan.nextInt(); 
        }
        System.out.println("Printing of for loop");
        for(int b:array){
            System.out.println(b);
            
        }
        scan.close();
     }
}