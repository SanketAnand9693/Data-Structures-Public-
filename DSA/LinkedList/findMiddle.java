public class findMiddle  {
    // public void middle(Node slow,Node fast){
    //     slow=head;
    //     fast=head;
    //     Node middle;
    //     while(fast!=null && fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     middle=slow;  
    //     System.out.println(middle);
    //     return;
    // }
    public static void main(String[] args) {
        LinkedList llist1=new LinkedList();
        llist1.insertAtEnd(1);
        llist1.insertAtEnd(2);
        llist1.insertAtEnd(3);
        llist1.insertAtEnd(4);
        llist1.printNodes();
        System.out.println();
        System.out.println("middle of linkedlist: ");
    

        
    }
}
