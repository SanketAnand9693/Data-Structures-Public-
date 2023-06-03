import java.util.ArrayDeque;

public class _arrayDeque {
    public static void main(String args[]){
        ArrayDeque<Object> ad1= new ArrayDeque<>();
        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        System.out.println(ad1);
        ad1.addFirst("Sanket");
        ad1.addLast("Anand");
        //ArrayDeque can either be homogenous or hetergeneous
        System.out.println(ad1);
        ad1.offer(69);
        ad1.offerFirst(181);
        ad1.offerLast(96);
        // .offer may be rejected. It is also used for insertion of element in collection.
        System.out.println(ad1);
    }
    
}
