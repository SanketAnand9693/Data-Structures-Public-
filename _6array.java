import java.util.Scanner;
public class _6array {
 public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int array[]=new int[a];
    for(int i=0;i<a;i++){
        array[i]=scan.nextInt(); 
    }
    for(int i=0;i<a;i++){
        System.out.print(array[i]+ " ");
    }
    scan.close();
 }
}
