package linkedlist;

public class RotateLinkedListKthTimeRight {
    public static Node rotateRight(Node head,int k)
    {
        if(head==null)
        {
            return  head;
        }
        int size=0;
        Node curr=head;
        while (curr.next!=null)
        {
            size++;
            curr=curr.next;
        }
        size+=1;
        k=k%size;
        curr.next=head;
        for(int i=0;i<k;i++)
        {
            curr=curr.next;
        }
        Node newHead=curr.next;
        curr.next=null;
        return newHead;
    }
}
