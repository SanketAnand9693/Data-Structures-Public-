import java.util.*;

public class _traversingMaps{
    public static void main(String args[]){
        HashMap<Integer,Object> hm1=new HashMap();
        hm1.put(null, null);
        hm1.put(01, "Sanket");
        hm1.put(02, "Anand");
        hm1.put(03,"Oriental");
        System.out.println(hm1);
         
        System.out.println(hm1.get(02));
    //To get keys from Hashmap
        Set keyset=hm1.keySet();
        Iterator itr1=keyset.iterator();
        while(itr1.hasNext())
        {
            Integer key=(Integer)itr1.next();
            System.out.println(key);
            // System.out.println(itr1.next());
        }


    //To get values from Hashmap
        Collection values=hm1.values();
        Iterator itr2= values.iterator();
        while(itr2.hasNext()){
            String value=(String)itr2.next();
            System.out.println(itr2.next());
        }
    //To get both keys and values from Hashmap    
        Set entryset=hm1.entrySet();
        Iterator itr3=entryset.iterator();
        while(itr3.hasNext()){
            Map.Entry data=(Map.Entry)itr3.next();
            System.out.println(data.getKey()+" : "+data.getValue());
        }

    }
}