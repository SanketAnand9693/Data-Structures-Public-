import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _forEach{
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<Integer>();
        // l1.add(2);
        // l1.add(3);
        // l1.add(5);
        // l1.add(8);
        // l1.add(9);
        System.out.println(l1);

        List<Integer> l2=Arrays.asList(2,1,4,5,2);
        System.out.println(l2);
        // for (Integer o:l2){
        //     System.out.println(o);
        // }

        l2.forEach(i->System.out.println(i)); // forEach() implements Consumer interface
    }
}