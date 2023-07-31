import java.util.LinkedHashSet;

public class _160IntersectionOfLinkedList extends LinkedList{
    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        list1.insertAtEnd(4);
        list1.insertAtEnd(1);
        list1.insertAtEnd(8);
        list1.insertAtEnd(4);
        list1.insertAtEnd(5);
        LinkedList list2=new LinkedList();
        list2.insertAtEnd(5);
        list2.insertAtEnd(6);
        list2.insertAtEnd(1);
        list2.insertAtEnd(8);
        list2.insertAtEnd(4);
        list2.insertAtEnd(5);
        Node temp1=list1.head;
      
        while(temp1.next!=null){    
            Node temp2=list2.head;
            while(temp2.next!=null){
                if(temp2.data==temp1.data){
                    System.out.println("Intersection at "+ temp1.data);
                    return;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        System.out.println();
        return;
    }
}
