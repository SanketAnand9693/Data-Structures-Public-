import java.util.HashMap;
import java.util.TreeMap;

import java.util.LinkedHashMap;

public class _1TypesOfHashMap{
    public static void main(String[] args) {
        //Unordered Map
        HashMap<Integer,String> map=new HashMap<>();
        map.put(3,"Priya");
        map.put(1,"Ajay");
        map.put(7, "Piyush");
        map.put(5, "Jeet");
        System.out.println("HashMap looks like: "+map);

        //LinkedHashMap 
        LinkedHashMap<Integer,String> map1=new LinkedHashMap<>();
        map1.put(3,"Priya");
        map1.put(1,"Ajay");
        map1.put(7, "Piyush");
        map1.put(5, "Jeet");
        System.out.println("LinkedHashMap looks like: "+map);

        //TreeMap
        TreeMap<Integer,String> map2=new TreeMap<>();
        map2.put(3,"Priya");
        map2.put(1,"Ajay");
        map2.put(7, "Piyush");
        map2.put(5, "Jeet");
        System.out.println("TreeMap looks like: "+map);        
    }
}