import java.util.*;
public class _traversingCollection {
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(30);
        // By using for loop we can iterate but it is not a goo
        for(int i=0;i<al.size();i++){
            System.out.println(i+ "th index value is "+ al.get(i));
        }

        //Iterator can only traverse forward.
        // Iterator itr= al.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }


        //for traversing backwards
        ListIterator<Integer> litr=al.listIterator(al.size());
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
