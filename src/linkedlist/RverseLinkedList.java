package linkedlist;

public class RverseLinkedList {

    public static Node reverseLinkedList(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }

        return prev;

    }//TC:(O(n)),SC:O(1)
}
