package linkedlist;

public class LinkTwoSortedLinkedList {
    public Node mergeTwoList(Node list1,Node list2)
    {
        Node newHead=new Node(-1);
        Node p1=list1,p2=list2,curr=newHead;
        while(p1!=null && p2!=null)
        {
            if(p1.value<p2.value)
            {
                curr.next=p1;
                curr=curr.next;
                p1=p1.next;
            }else{
                curr.next=p2;
                curr=curr.next;
                p2=p2.next;
            }

        }
        if(p1==null) curr.next=p2;
        if(p2==null)curr.next=p1;
        return newHead;
    }
}
