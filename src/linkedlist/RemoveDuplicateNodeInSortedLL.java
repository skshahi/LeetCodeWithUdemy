package linkedlist;

import java.util.Stack;

public class RemoveDuplicateNodeInSortedLL {
    public static  Node deleteDuplicate(Node head)
    {
        if(head==null)
            return head;

        Node currNode=head;
        Stack<Node> stack=new Stack<>();
        while(currNode!=null)
        {
            if(stack.isEmpty())
            {
                stack.push(currNode);
            }else {
                if(stack.peek().value!=currNode.value)
                {
                    stack.push(currNode);
                }
            }
            currNode=currNode.next;
        }
        Node newHead=null;
        while(!stack.isEmpty())
        {
            Node pop = stack.pop();
            pop.next=newHead;
            newHead=pop;
        }

        return newHead;

    }


    public static Node  removeDuplicate(Node head)
    {

        if(head==null)
            return head;
        Node dummyNode=new Node(-1);
        dummyNode.next=head;
        Node curr=head,prev=dummyNode;
        while(curr!=null)
        {
            if(curr.next!=null && curr.value==curr.next.value)
            {
                while(curr.next!=null && curr.value==curr.next.value)
                {
                    curr=curr.next;
                }
                prev.next=curr;
                prev=curr;
            }else {
                prev=curr;
            }
            curr=curr.next;
        }
        return dummyNode.next;

    }
}
