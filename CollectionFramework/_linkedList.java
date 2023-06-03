import java.util.LinkedList;

public class _linkedList {
    public static void main(String args[]){
        LinkedList<Object> ll1=new LinkedList<>();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(30);
        System.out.println(ll1);
        // There are some more method as compared to arraylist like- addFirst and addlast.
        ll1.addFirst("Sanket");
        ll1.addLast("Anand");
        System.out.println(ll1);
        //To find the first element of collection we can use peek method to find it.
        //After using peek there is no change in collection.
        System.out.println(ll1.peek());
        System.out.println(ll1);
        //To find the first element of collection we can also use poll method to find it but it deletes the first element after giving.
        System.out.println(ll1.poll()); //poll method called it means after printing head element is removed from the collection.
        System.out.println(ll1);
        System.out.println(ll1.get(2)); // To print element present at the index
        System.out.println(ll1.indexOf(20));// To print to index of element in collection
        System.out.println(ll1.lastIndexOf(30));// To print the last index of the same element present in collection
        System.out.println(ll1.getFirst()); // To print the element in first index.
        System.out.println(ll1.getLast()); // To printthe element of the last index.
        ll1.push(1);//It add the element at the first position
        System.out.println(ll1);
        ll1.pop();// It removes the first elements
        System.out.println(ll1); 
    }
}
