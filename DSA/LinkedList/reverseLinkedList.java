//Inherit of linkedList class
public class reverseLinkedList extends LinkedList{
    //Reversing a LinkedList by using iteration
    public void reverseItr(Node head,int left,int right){
        Node curr=head;
        Node nextptr=curr.next;
        Node prev=null;
        while(curr!=null && curr.data!=left){
            if(nextptr.data==left){
                break;
            }
            nextptr=curr.next;
            curr=curr.next;
            
        }
        ///////////
        while(curr!=null){
            if(curr.data==right || left<=right){
                System.out.println("between left right");
                nextptr=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextptr;
            }
        }
        return;
    }
    //Reversing a LinkedList by using recursion
    public void reverseRec(Node curr,Node prev){
        if(curr.next==null){
            head=curr;
            curr.next=prev;
            return;
        }
        Node nextPtr=curr.next;
        curr.next=prev;
        reverseRec(nextPtr, curr);
    }

    public static void main(String[] args) {
        reverseLinkedList ll=new reverseLinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);

        ll.printNodes();
        System.out.println();
        System.out.println("Reversal of linked List: ");
        ll.reverseItr(ll.head, 4,5);
        ll.printNodes();

    }
}