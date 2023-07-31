class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // display all the nodes after the insertion
    public void insertAtEnd(int newData){
        // intialize the newNode with the newData entered by the user
        Node newNode = new Node(newData);

        // LinkedList is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // LinkedList is not empty
        newNode.next = null;
        // traversing the linkedlist at the end of the node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }
    
    //Method for Insertion at Start of linkedList
    public void insertAtStart(int newData){
        Node newNode= new Node(newData);
        newNode.next=head;
        head=newNode;
        }
    
    //Insertion at Middle of linkedList
    public void insertAfter(Node prevNode,int newData){
        if(prevNode==null){
            System.out.println();
            return;
        }
        Node newNode= new Node(newData);
        newNode.next=prevNode.next;
        prevNode.next=newNode;
    }

    public void insertafter(int prevNode,int newData){
        
        Node temp;
        temp=head;
        while(prevNode!=temp.data){
            temp=temp.next;
        }
        Node newNode=new Node(newData);
        newNode.next=temp.next;
        temp.next=newNode;
    }


    //Deletion of Node from LinkedList
    public void deleteNode(int position){
        if(head==null){
            return;
        }
        Node temp=head;
        if(position==0){
            head=temp.next;
            return;
        }
        for(int i=0;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        
        if(temp==null && temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }

    public void middleNode(Node slow,Node fast){
        slow=head;
        fast=head;
        Node middle;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        middle=slow;  
        System.out.println(middle.data);
        return;
    }

    public void detectLoop(){
        Node slow=head,fast=head;
        int flag=0;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("No Loop found");
        }
        else{
            System.out.println("Loop found");
        }
    }
    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+"->");
            current = current.next;

        }
    }
    //Reversal of the Linked List
    public void reverseLinkedList() {
        Node curr=head;
        Node nextptr=null;
        Node prev=null;
        while(curr!=null){
            nextptr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextptr;
        }
        head=prev;
        return;
    }

}


public class _35LinkedList{
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // function calling
        llist.insertAtEnd(3);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        llist.insertAtEnd(10);
        llist.insertAtEnd(15);

        // System.out.println("Linked List after successful insertion of all the nodes:");
        // llist.printNodes();
        // System.out.println();
        // System.out.println("New node insertion at end: ");
        // llist.insertAtEnd(20);
        // llist.printNodes();
        // System.out.println();
        // System.out.println("After the insertion at start: ");
        // llist.insertAtStart(69);
        // llist.printNodes();
        // System.out.println();
        // System.out.println("Insertion after a node (After head->next): ");
        // llist.insertAfter(llist.head.next, 69);
        // llist.printNodes();
        // System.out.println();
        // System.out.println("Deletion of 2 index node");
        // llist.deleteNode(2);
        // llist.printNodes();
        // System.out.println();
        // System.out.println("Insertion after by new method");
        // llist.insertafter(15, 26);
        // llist.printNodes();
        // System.out.println();
        // System.out.println("Reversal of LinkedList");
        // llist.reverseLinkedList();


        //This is for Circular linked list creation. For checking the method detectloop
        LinkedList.Node temp=llist.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=llist.head;

        llist.detectLoop();


    }
}
