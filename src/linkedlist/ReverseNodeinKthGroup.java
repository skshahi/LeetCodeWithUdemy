package linkedlist;

public class ReverseNodeinKthGroup {
    public static  Node reverseKthGroup(Node head ,int k)
    {
        int count=k;
        Node curr=head;
        while(curr!=null && count!=0)
        {
            count--;
            curr=curr.next;
        }
        if(count>0) return head;
        Node prev=reverseKthGroup(curr,k);
        Node currHead=head;
        for(int i=0;i<k;i++)
        {
            Node next=currHead.next;
            currHead.next=prev;
            prev=currHead;
            currHead=next;
        }
        return prev;
    }
}
