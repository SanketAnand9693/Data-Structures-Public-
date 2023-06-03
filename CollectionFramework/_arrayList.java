import java.util.*;
class _arrayList{
    public static void main(String args[]){
        ArrayList<Object> al1=new ArrayList<>();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1); 
        ArrayList<Object> al2=new ArrayList<>();
        al2.add("Sanket");
        al2.add(2);
        al2.add('j');
        al2.add(1.1);
        System.out.println(al2);
        System.out.println("**********************************");

        //We can add two collection in one collection by using addAll method. which is util package.
        al2.addAll(al1);
        System.out.println(al2);
        //We can add element to arrayList using indexing here no element will be deleted shifting of element is done.
         al1.add(2,"Anand");
         al1.ensureCapacity(10);// It ensures 10 spaces for the elements to be added later.
         System.out.println(al1);
    }
}