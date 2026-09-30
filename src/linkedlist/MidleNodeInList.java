package linkedlist;

public class MidleNodeInList {

    public static Node middleNode(Node head)
    {
        //base case if linked list contains only one node
        if(head.next==null) return head;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return  slow;

    }

    public static void main(String[] args) {
//        Node head=new Node(2);
//            head.next=new Node(3);
//       head.next.next=new Node(5);
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.addNode(2);
        sll.addNode(3);
        sll.addNode(5);


        System.out.println(middleNode(sll.head).value);

    }

}
