package linkedlist;

public class ReorderLinkedList {
    public Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        while(curr.next!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public void reorderList(Node head)
    {
        if(head==null || head.next==null) return ;
        Node slow=head,fast=head;
        while (fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2=slow.next;
        slow.next=null;
        Node head1=head;
        head2=reverse(head2);
        Node curr=new Node(-1);
        while (head1!=null)
        {
            Node temp=head1.next;
            curr.next=head1;
            head1.next=head2;
            curr=head2;
            head1=temp;
            if(head2!=null) head2=head2.next;

        }


    }
}
