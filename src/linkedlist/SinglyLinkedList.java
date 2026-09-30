package linkedlist;

public class SinglyLinkedList {
    Node head=null,tail=null;
    int size=0;
    SinglyLinkedList()
    {

        System.out.println("A Singly Linked List Created ");
    }
    public void addNode(int value)
    {
//        Node node=new Node(value);
//        if(head==null)
//        {
//            head=node;
//            tail=node;
//            size=1;
//            return;
//        }
//        Node currentNode=head;
//        while(currentNode.next!=null)
//        {
//            currentNode=currentNode.next;
//        }
//        currentNode.next=node;
//        tail=node;
//        size++;
        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;

    }
}
