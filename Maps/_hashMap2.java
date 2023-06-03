import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student
    {
        private String name;
        private int age;
        private String city;

        public Student(String name, int age, String city){
            this.name= name;
            this.age=age;
            this.city=city;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }

        public String toString(){
            return name +" "+age+" "+city;
        }
        
    }


public class _hashMap2
{    
    public static void main(String args[])
    {
        Student st1=new Student("Rohan", 18, "Bengaluru");
        Student st2=new Student("Rohit",19,"Delhi");
        Student st3=new Student("Ramesh", 22, "Mysore");

        HashMap<Integer,Student> map=new HashMap<>();
        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);
        Set set=map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //System.out.println(itr.next());
            Map.Entry<Integer,Object> data=(Map.Entry)itr.next();
            System.out.println(data.getKey()+" : "+data.getValue());
        }

    }
}
