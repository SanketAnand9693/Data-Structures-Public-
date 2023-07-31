import java.util.HashMap;
import java.util.Map;

public class _1HashMap{
    public static void main(String[] args) {
        //Instance is created of HashMap.
        HashMap<Integer,String> hashmap=new HashMap<>();

        //Functionality of the put() method.
        hashmap.put(1, "Sanket");
        hashmap.put(2, "Anand");
        hashmap.put(3, "Priya");
        hashmap.put(4, "Bhatia");

        System.out.println("HashMap of the given data is: "+ hashmap);

        //Functionality of the get() method.
        String str=hashmap.get(3);
        System.out.println("The value at key 3: "+str);

        //Functionality of containsKey() method.
        System.out.println(hashmap.containsKey(7));

        //Functionality of remove() method.
        hashmap.remove(2);
        System.out.println("Updated HashMap after removal: "+ hashmap);

        //Iterating
        for(Map.Entry<Integer,String> e: hashmap.entrySet()){
            System.out.println("HashMap: " + e.getKey()+"->"+e.getValue());
        }
    }
}