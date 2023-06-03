import java.util.TreeSet;

public class _treeSet {
    public static void main(String args[]){
        TreeSet<Integer> ts= new TreeSet<Integer>();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);
        //It print sorted collection because in backend it works on Binary search Tree.
        System.out.println("ceiling method "+ts.ceiling(40));
        System.out.println("floor method "+ ts.floor(40));
        System.out.println("higher method " +ts.higher(50));
        System.out.println("lower method " + ts.lower(50));

    }
    
}
