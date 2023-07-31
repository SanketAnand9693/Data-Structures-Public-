public class LoopDetection {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        LinkedList.Node temp=ll.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=ll.head;
        ll.detectLoop();

    }
}